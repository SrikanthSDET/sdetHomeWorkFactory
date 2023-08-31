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

public class CreateServiceTerritories {
	@Test
	public void createServiceTerritories() {
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
		
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Service Territories");
		
		WebElement serviceTerritoriesElement = driver.findElement(By.xpath("//a[@data-label='Service Territories']"));		
		
		wait.until(ExpectedConditions.elementToBeClickable(serviceTerritoriesElement));
		
		driver.executeScript("arguments[0].click()", serviceTerritoriesElement);
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Srikanth Murugavel");
		
		driver.findElement(By.xpath("//input[@placeholder='Search Operating Hours...']")).click();
		
		driver.findElement(By.xpath("(//ul[@aria-label='Recent Operating Hours']/li)[2]")).click();
		
		WebElement activeCheckBoxElement = driver.findElement(By.xpath("//input[@type='checkbox' and @name='IsActive']"));
		driver.executeScript("arguments[0].click()", activeCheckBoxElement);
		driver.findElement(By.xpath("//label[text()='City']/..//input")).sendKeys("Chennai");
		
		driver.findElement(By.xpath("//label[text()='State/Province']/..//input")).sendKeys("Tamilnadu");
		
		driver.findElement(By.xpath("//label[text()='Country']/..//input")).sendKeys("India");
		
		driver.findElement(By.xpath("//label[text()='Zip/Postal Code']/..//input")).sendKeys("600078");
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		String territoryConfirmationtext = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		
		Assert.assertTrue(territoryConfirmationtext.contains("Srikanth"));
		
		driver.close();
	}

}
