package put;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateRecordBDD {
	
	@Test
	public void updateRecordBDD() {
		RestAssured
		.given()
			.baseUri("https://reqres.in/")
			.header("Content-Type","application/json")
			.body("{\r\n"
					+ "    \"name\": \"Srikanth M\",\r\n"
					+ "    \"job\": \"Senior SDET\"\r\n"
					+ "}")
		.when()
			.put("api/users/2")
		.prettyPrint();
	}

}
