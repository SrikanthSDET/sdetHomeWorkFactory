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

public class DeleteTask {
	@Test
	public void deleteTask() {
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
		
		WebElement OppTabElement = driver.findElement(By.xpath("//a[@title='Tasks']"));
		
		driver.executeScript("arguments[0].click()", OppTabElement);
		
		driver.findElement(By.xpath("//button[@title='Select a List View: Tasks']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Recently Viewed'])[3]/..")).click();
		
		String taskSubjecttext = driver.findElement(By.xpath("(//span[text()='Subject']/../following-sibling::div//span)[2]")).getText();
		
		driver.findElement(By.xpath("//a[@title='Show 5 more actions']")).click();
		
		driver.findElement(By.xpath("//div[@title='Delete']/..")).click();
		
		driver.findElement(By.xpath("//button[@title='Delete']")).click();
		
		String delConfirmText = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		
		Assert.assertTrue(delConfirmText.contains(taskSubjecttext));
		
		driver.close();
	}

}
