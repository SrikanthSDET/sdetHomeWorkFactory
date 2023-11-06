package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testng.base.BaseClass;

public class TC001_CreateLead extends BaseClass{
	@BeforeTest
	public void setValues() {
		testName="Create Lead";
		testDescription="Create Lead with Mandatory Data";
		testAuthor="Srikanth";
		testCategory="Regression";
	}
	
	@Test
	public void createLead() {
		System.out.println("Lead Created Successful");
	}

}
