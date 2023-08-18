package jira;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UpdateIncident extends BaseClass{
	
	@Test(dependsOnMethods = "jira.RetriveIncident.retriveIncidentJira")
	public void updateIncidentJira() {
		//RestAssured.baseURI="https://testjirafeb2023.atlassian.net/rest/api/2/";
		//RestAssured.authentication = RestAssured.preemptive().basic("Feb2023restAPI@gmail.com","ATATT3xFfGF0d39TsozfFQWR0Hvr0UfPqKKtyFJxQvnaGGtSvez8FvOvhfzSTapOBEUGx0ZAdIbWfM5tjeU8rFw7Rh72pbanmBdYhtysnC3yH89HMn-lXz9PTGKVKtWFV2vp6GyZ_75P27LqLCAbHxqOjYds1SNn5oFZQFDi3ufeUI3cJwdCy20=5543D93F");
		
		Response resp = RestAssured.given()
		.contentType("application/json")
		.when()		
		.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"description\": \"Bug creation Using REST API for testing\"\r\n"
				+ "    }\r\n"
				+ "}")
		.put("/issue/"+incidentId);
		
		resp.prettyPrint();
		
	}

}
