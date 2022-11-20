package Callsign.CallSignAssignment;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import APIUtils.Comonutil;
import PojoDeserialize.CryptoCurrencyMap;
import PojoDeserialize.Datum;

public class BackendTest1 {

@Test
public void backendTask1()
{
		
		CryptoCurrencyMap cp=given().log().all().spec(Comonutil.reqstSpec())
				.expect().defaultParser(Parser.JSON)
				.when().get("/v1/cryptocurrency/map")
		.then().spec(Comonutil.respSpec())
		.extract().response().getBody().as(CryptoCurrencyMap.class);
		
		System.out.println(cp.getStatus().getTimestamp());
		
		List<Datum> dt=cp.getData();
		
		List<Integer> id=dt.stream().filter(e->e.getName().equals("Ethereum"))
		.map(e->e.getId()).collect(Collectors.toList());
		
		List<Integer> id1=dt.stream().filter(e->e.getName().equals("Bitcoin"))
				.map(e->e.getId()).collect(Collectors.toList());
		
		List<Integer> id2=dt.stream().filter(e->e.getName().equals("Tether"))
				.map(e->e.getId()).collect(Collectors.toList());
		
		List<Integer> newList = Stream.of(id, id1, id2)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());       
System.out.println(newList);

	}

}
