package delete;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRecord {
	@Test
	public void deleteRecord() {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req =RestAssured.given();
		Response resp = req.request(Method.DELETE,"api/users/6");
		System.out.println(resp.asPrettyString());
		System.out.println(resp.statusLine());
	}

}
