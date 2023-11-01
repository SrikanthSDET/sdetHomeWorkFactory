package coviddata;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CovidDataFilter {
	public static void main(String[] args)  {
		RestAssured.baseURI="https://covid-19.dataflowkit.com";
		//Response response = RestAssured.given().param("s", "Fantabulous").when().get(baseURI).then().extract().response();
		Response response = RestAssured.given()
				.param("s", "Fantabulous")
				.contentType("application/json")
				.when()
			    .get("/v1");
				response.prettyPrint();
		}
	//JsonPath jsonPath = response.jsonPath();

	//int count = jsonPath.getInt("Search.size()");
	
}
