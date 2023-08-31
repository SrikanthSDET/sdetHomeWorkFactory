package assessment.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EditServiceTerritories {
	@Test
	public void editServiceTerritories() throws InterruptedException {
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
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@class,'rowActionsPlaceHolder')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@title='Edit'])[2]")).click();
		
		
		
		WebElement countryElement = driver.findElement(By.xpath("//label[text()='Country']/..//input"));
		
		countryElement.clear();
		
		countryElement.sendKeys("North Ameria");
		
		String ownerText = driver.findElement(By.xpath("(//span[text()='Owner'])[3]/../following-sibling::div//span[@class='displayLabel']")).getText();
		
		System.out.println(ownerText);
	}
	
}
