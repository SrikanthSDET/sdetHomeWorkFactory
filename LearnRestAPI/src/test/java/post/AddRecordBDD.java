package post;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class AddRecordBDD {
	
	@Test
	public void addRecordBDD() {
		RestAssured
		.given()
			.baseUri("https://reqres.in/")
			.header("Content-Type","application/json")
			.body("{\r\n"
					+ "    \"name\": \"Srikanth\",\r\n"
					+ "    \"job\": \"Senior SDET\"\r\n"
					+ "}")
		.when()
			.post("api/users")
		.prettyPrint();
	}

}
