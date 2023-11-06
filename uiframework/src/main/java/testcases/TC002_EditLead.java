package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testng.base.BaseClass;

public class TC002_EditLead extends BaseClass{
	@BeforeTest
	public void setValues() {
		testName="Edit Lead";
		testDescription="Edit the Lead Value";
		testAuthor="Srikanth";
		testCategory="Regression";
	}
	
	@Test
	public void editLead() {
		System.out.println("Lead Edited Successful");
	}

}
