package testng.base;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utills.ExtentReport;

public class BaseClass extends ExtentReport{
	
	@BeforeMethod
	public void loginTest() {
		System.out.println("Login Successful");
	}
	
	@AfterMethod
	public void logoutTest() {
		System.out.println("Logout Successful");
	}

}
