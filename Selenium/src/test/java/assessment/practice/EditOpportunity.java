package assessment.practice;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class EditOpportunity {
	@Test
	public void editOpportunity() throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
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
		
		String OppName = "Salesforce Automation By Srikanth";		
		
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys(OppName,Keys.ENTER);
		
		//driver.findElement(By.xpath("//div[contains(@class,'highlights-icon-container')]/img")).click();
		Thread.sleep(1000);
		//WebElement actionDropdownElement = driver.findElement(By.xpath("//a[contains(@class,'rowActionsPlaceHolder')]"));
		//wait.until(ExpectedConditions.elementToBeClickable(actionDropdownElement));
		//actionDropdownElement.click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(@class,'rowActionsPlaceHolder')]")))).click();
		WebElement editDropdownElement = driver.findElement(By.xpath("//a[@title='Edit']"));
		wait.until(ExpectedConditions.elementToBeClickable(editDropdownElement));		
		editDropdownElement.click();
		
		Date clearDate = new Date();
		
		int date = clearDate.getDate();
		
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'slds-datepicker')]//span[text()='"+(date+1)+"']")).click();
		
		WebElement stageDropDownElement = driver.findElement(By.xpath("(//button[@role='combobox'])[2]"));
		driver.executeScript("arguments[0].click()", stageDropDownElement);
		
		String stageStatusUpdate="Perception Analysis";
		driver.findElement(By.xpath("//span[@title='"+stageStatusUpdate+"']")).click();
		
		driver.findElement(By.xpath("//textarea")).sendKeys("SalesForce");
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(1000);		
		WebElement stageStatusElement = driver.findElement(By.xpath("(//table//tr/td)[5]//span[@class='slds-truncate']"));
		
		//wait.until(ExpectedConditions.textToBePresentInElementValue(stageStatusElement, stageStatusUpdate));		
		
		Assert.assertEquals(stageStatusElement.getText(),stageStatusUpdate);
		
		driver.close();
	}
}
