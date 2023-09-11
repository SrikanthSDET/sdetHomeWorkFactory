package weatherstack;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class CurrentWeather extends BaseClass{
	@Test
	public void getCurrentWeather() {
		
		/*
		 * RequestSpecification requestSpec = RestAssured.given();
		 * requestSpec.contentType("application/json");
		 * requestSpec.queryParam("access_key", "b39626c27f11f11ab6202da84d1cffa7");
		 * Response resp = requestSpec.queryParam("query", "Chennai") .get();
		 * resp.prettyPrint();
		 */
		Response resp = RestAssured.given()
				.contentType("application/json")
				.param("access_key", "b39626c27f11f11ab6202da84d1cffa7")
				.param("query", "Chennai").get("/current");
		
		resp.prettyPrint();
		city = resp.jsonPath().get("x.request.type");		
		resp.then().assertThat().statusCode(200);

	}

}
