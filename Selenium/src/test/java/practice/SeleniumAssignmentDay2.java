package practice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumAssignmentDay2 {
	@Test
	public void createNewDashboard() {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		//EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.xpath("//input[contains(@id,'pa')]")).sendKeys("Leaf$1234");
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//span[text()='App Launcher']/../..")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		WebElement dashboardLink = driver.findElement(By.xpath("//p[text()='Dashboards']/ancestor::a"));
		
		driver.executeScript("arguments[0].click()", dashboardLink);
		
		driver.findElement(By.xpath("//div[text()='New Dashboard']/parent::a")).click();
		
		WebElement dashBoardFrame = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		
		driver.switchTo().frame(dashBoardFrame);
		
		driver.findElement(By.id("dashboardNameInput")).sendKeys("Srikanth M");
		
		driver.findElement(By.id("submitBtn")).click();	
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		driver.switchTo().defaultContent();
		
		
	}
}
