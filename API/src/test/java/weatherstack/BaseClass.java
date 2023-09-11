package weatherstack;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseClass {
	public static String city;
	@BeforeMethod
	public void setUp() {
		RestAssured.baseURI="http://api.weatherstack.com";
	}

}
