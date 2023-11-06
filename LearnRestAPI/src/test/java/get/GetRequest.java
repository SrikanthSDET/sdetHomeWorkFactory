package get;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	@Test(enabled=false)
	public void getAllRecords() {
		RestAssured.baseURI="https://reqres.in/"; 
		RequestSpecification reqSpecification = RestAssured.given();
		Response resp = reqSpecification.request(Method.GET,"api/users?page=2");
		System.out.println(resp.asPrettyString());
		System.out.println(resp.getStatusLine());
	}
	
	@Test(enabled=false)
	public void getSpecificRecord() {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response resp =req.request(Method.GET,"api/users/2");
		System.out.println(resp.asPrettyString());
		System.out.println(resp.statusLine());
	}
	
	
}
