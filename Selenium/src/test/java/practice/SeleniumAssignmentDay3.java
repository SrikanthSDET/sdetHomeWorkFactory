package practice;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumAssignmentDay3 {
	@Test
	public void createCampaigns() {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.xpath("//input[contains(@id,'pa')]")).sendKeys("Leaf$1234");
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//span[text()='App Launcher']/../..")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		WebElement campaignsLinkElem = driver.findElement(By.xpath("//a[@title='Campaigns']"));
		driver.executeScript("arguments[0].click()", campaignsLinkElem);
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
		
		driver.findElement(By.xpath("//h2[text()='New Campaign']/parent::article//input")).sendKeys("Bootcamp");
		
		Date clearDate = new Date();
		
		int date = clearDate.getDate();
		
		driver.findElement(By.xpath("//a[contains(@class,'datePicker')]")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'uiDatePicker')])[1]//span[text()='"+(date+1)+"']")).click();
		
		driver.findElement(By.xpath("(//a[contains(@class,'datePicker')])[2]")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'uiDatePicker')])[2]//span[text()='"+(date+2)+"']")).click();
		
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		
		//After clicked the Save Button getting Below Error in Application due to which unable to verify the Campaign record 
		//Review the errors on this page.
		//storage limit exceeded
	}
}
