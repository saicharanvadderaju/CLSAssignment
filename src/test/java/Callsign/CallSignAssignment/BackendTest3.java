package Callsign.CallSignAssignment;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertTrue;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import APIUtils.Comonutil;
import PojoDeserialize.CryptoCurrencyMap;
import PojoDeserialize.CryptocurrencyInfo;
import PojoDeserialize.Datum;

public class BackendTest3 {

	@Test
	public void backendTask3()
	{
		
		for(int i=1;i<=10;i++)
		{
		cryptoCurrencyInfo(i);
		}

	}
	
	public static void cryptoCurrencyInfo(int id)
	{
		String resp=given().log().all().spec(Comonutil.reqstSpec())
				.queryParam("id", id)
				.expect().defaultParser(Parser.JSON)
				.when().get("/v1/cryptocurrency/info")
		.then().log().all().spec(Comonutil.respSpec())
		.extract().response().asString();
		
		JsonPath jp=new JsonPath(resp);
		
		List<String> tagsList=jp.getList("data."+id+".tags");
		Boolean containsmineable= tagsList.contains("mineable");
		Assert.assertTrue(containsmineable);
	}

}
