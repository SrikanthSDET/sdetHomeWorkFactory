package post;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class AddRecord {
	
	@Test
	public void addRecordPostMethod() {
		RestAssured.baseURI="https://reqres.in/";
		Response resp = RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"name\": \"Srikanth\",\r\n"
						+ "    \"job\": \"Senior SDET\"\r\n"
						+ "}")
		.request(Method.POST,"api/users");
		System.out.println(resp.asPrettyString());
		System.out.println(resp.statusLine());
	}

}
