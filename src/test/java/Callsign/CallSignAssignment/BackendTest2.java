package Callsign.CallSignAssignment;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.parsing.Parser;
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

public class BackendTest2 {

@Test
public void backendTask2()
{
		
		CryptocurrencyInfo cpi=given().log().all().spec(Comonutil.reqstSpec())
				.queryParam("id", "1027")
				.expect().defaultParser(Parser.JSON)
				.when().get("/v1/cryptocurrency/info")
		.then().log().all().spec(Comonutil.respSpec())
		.extract().response().getBody().as(CryptocurrencyInfo.class);
		
		//2. Confirm that the following logo URL is present:“logo”: https://s2.coinmarketcap.com/static/img/coins/64x64/1027.png.	
		String url=cpi.getData().get1027().getLogo();
		Assert.assertEquals(url,"https://s2.coinmarketcap.com/static/img/coins/64x64/1027.png");
		
		//3. Confirm that the technical_doc Url is present:“technical_doc”: [ https://github.com/thereum/wiki/wiki/White-Paper ]
		List<String> technicalDoc=cpi.getData().get1027().getUrls().getTechnicalDoc();
		Boolean exists=technicalDoc.contains("https://github.com/ethereum/wiki/wiki/White-Paper");
		Assert.assertTrue(exists);
		
		//4. Confirm that the symbol of the currency is ETH: “symbol”: “ETH”
		String symbol=cpi.getData().get1027().getSymbol();
		Assert.assertEquals(symbol, "ETH");
		
		//5. Confirm that the date added is: “date_added”: “2015-08-07T00:00:00.000Z”
		String dateadded=cpi.getData().get1027().getDateAdded();
		Assert.assertEquals(dateadded, "2015-08-07T00:00:00.000Z");
		
		//6. Confirm that the currency has the mineable tag associated with it:"tags": [ "mineable" ]
		
		List<String> mineabletagexists=cpi.getData().get1027().getTags();
		Assert.assertFalse(mineabletagexists.contains("mineable"));
		

	}
}
