package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewStoryInJira {
	@Test
	public void createNewStoryInJira() throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://api-training.atlassian.net/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.id("password")).sendKeys("India@123");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//p[text()='SDET-5']/ancestor::a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Create']/..")).click();
		driver.findElement(By.xpath("//input[@name='summary']")).sendKeys("Created the Story by SDET-5");
		WebElement findElement = driver.findElement(By.xpath("//button[@type='submit']"));
		driver.executeScript("arguments[0].click()", findElement);
		WebElement findElement2 = driver.findElement(By.xpath("//span[text()='Backlog']/ancestor::a"));
		driver.executeScript("arguments[0].click()", findElement2);
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Created the Story by SDET-5");
		String actualStoryText = driver.findElement(By.xpath("//mark")).getText();
		Assert.assertEquals(actualStoryText, "Created the Story by SDET-5");
	}

}
