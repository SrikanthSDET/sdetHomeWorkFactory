package weatherstack;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HistoricalWeather extends BaseClass{
	@Test (dependsOnMethods = "weatherstack.CurrentWeather.getCurrentWeather") 
	public void getHistoricalWeather() {
		Response resp = RestAssured.given()
		.contentType("application/json")
		.param("access_key", "b39626c27f11f11ab6202da84d1cffa7")
		.param("query", city)
		.param("historical_date", "1983-11-16")
		.param("hourly", "1")
		.get("/historical");
		resp.prettyPrint();
	}

}
