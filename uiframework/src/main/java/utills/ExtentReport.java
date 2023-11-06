package utills;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName,testDescription,testAuthor,testCategory;
	@BeforeSuite
	public void startReport() {		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report/result.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	@BeforeClass
	public void testCaseDetails() {
		test = extent.createTest(testName, testDescription);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);
	}
	
	@AfterSuite
	public void endReport() {
		extent.flush();
	}

	/*
	 * public static void main(String[] args) { // Create Physical Html File
	 * ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report/result.html");
	 * 
	 * // Create object for Extent Reports ExtentReports extent = new
	 * ExtentReports();
	 * 
	 * // Integrate physical file and data extent.attachReporter(reporter);
	 * 
	 * // Create Test Case ExtentTest test = extent.createTest("Login Test",
	 * "Login Valid Credential");
	 * 
	 * test.assignAuthor("Srikanth");
	 * 
	 * test.assignCategory("Regression");
	 * 
	 * test.pass("Enter User Name"); test.pass("Enter Password");
	 * test.fail("Click Login Button");
	 * 
	 * extent.flush();
	 * 
	 * }
	 */
}
