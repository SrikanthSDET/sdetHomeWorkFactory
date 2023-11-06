package put;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateRecord {
	@Test
	public void updateRecordPut() {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requ =RestAssured.given()
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"name\": \"Srikanth M\",\r\n"
				+ "    \"job\": \"Senior SDET\"\r\n"
				+ "}");
		Response resp = requ.request(Method.PUT,"api/users/395");
		System.out.println(resp.asPrettyString());
		System.out.println(resp.statusLine());
	}

}
