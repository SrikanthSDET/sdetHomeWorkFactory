package assessment.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteOppurtunity {
	@Test
	public void deleteOppurtunity() throws InterruptedException {
		
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
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		WebElement OppTabElement = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		
		driver.executeScript("arguments[0].click()", OppTabElement);
		
		String OppName = "Salesforce Automation By Srikanth";		
		
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys(OppName);
		
		driver.findElement(By.xpath("//div[contains(@class,'highlights-icon-container')]/img")).click();
		Thread.sleep(1000);
		WebElement actionDropdownElement = driver.findElement(By.xpath("//a[contains(@class,'rowActionsPlaceHolder')]"));
		wait.until(ExpectedConditions.elementToBeClickable(actionDropdownElement));
		actionDropdownElement.click();
		
		WebElement deleteDropdownElement = driver.findElement(By.xpath("//a[@title='Delete']"));
		wait.until(ExpectedConditions.elementToBeClickable(deleteDropdownElement));		
		deleteDropdownElement.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Delete']/..")));
		
		driver.findElement(By.xpath("//span[text()='Delete']/..")).click();
		//Thread.sleep(1000);
		
		String delConfirmText = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(delConfirmText);
		System.out.println(OppName);
		Assert.assertTrue(delConfirmText.contains(OppName));
		
		driver.close();
	}

}
