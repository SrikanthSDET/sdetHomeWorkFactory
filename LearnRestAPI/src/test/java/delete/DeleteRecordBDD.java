package delete;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteRecordBDD {
	@Test
	public void deletedRecordBDD() {
		RestAssured
		.given()
			.baseUri("https://reqres.in/")
		.when()
			.delete("api/users/2")
		.prettyPrint();
	
	}

}
