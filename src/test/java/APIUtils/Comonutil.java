package APIUtils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Comonutil {
	public static RequestSpecification reqstSpec()
	{
		RequestSpecification req= new RequestSpecBuilder()
				
				.setBaseUri("https://pro-api.coinmarketcap.com")
				.setUrlEncodingEnabled(false)
				.addHeader("X-CMC_PRO_API_KEY", "539acb21-237b-4c03-8f57-ad41cbfc054f")
				.build();
		return req;
				
	}
	
	public static ResponseSpecification respSpec()
	{
		ResponseSpecification resp=new ResponseSpecBuilder()
				.expectStatusCode(200).build();
		return resp;
				
	}
}
