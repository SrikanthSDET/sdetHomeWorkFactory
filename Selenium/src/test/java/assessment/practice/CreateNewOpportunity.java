package assessment.practice;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewOpportunity {
	@Test
	public void createNewOpportunity() throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("srikanth.murugavel@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("SDETj@#2023");
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'appLauncher')]")).click();
		
		WebElement viewAllElement = driver.findElement(By.xpath("//button[text()='View All']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(viewAllElement));
		
		viewAllElement.click();
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		WebElement OppTabElement = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		
		driver.executeScript("arguments[0].click()", OppTabElement);
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
		
		String OppName = "Salesforce Automation By Srikanth";
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(OppName);
		
		Date clearDate = new Date();
		
		int date = clearDate.getDate();
		
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'slds-datepicker')]//span[text()='"+date+"']")).click();
		
		WebElement stageDropDownElement = driver.findElement(By.xpath("//button[@role='combobox']"));
		driver.executeScript("arguments[0].click()", stageDropDownElement);
		
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		Thread.sleep(1000);
		
		String OppConfirmationText = driver.findElement(By.xpath("//div[text()='"+OppName+"']")).getText();
		
		Assert.assertEquals(OppName, OppConfirmationText);		
		
		driver.close();
		
	}

}
