package post;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class AddRecordFromJSONFile {
	
	@Test
	public void addRecordFromJSONFile() {
		File jsonFile = new File("./data/addDataReqResSourrce.json");
		RestAssured
		.given()
			.baseUri("https://reqres.in/")
			.header("Content-Type","application/json")
			.body(jsonFile)
		.when()
			.post("api/users")
		.prettyPrint();
	}

}
