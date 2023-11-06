package get;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestBDD {	
	@Test
	public void getUsingBDDStyle() {
		RestAssured
		.given()
			.baseUri("https://reqres.in/")
		.when()
			.get("api/users/2")
		.prettyPrint();
		
	}

}
