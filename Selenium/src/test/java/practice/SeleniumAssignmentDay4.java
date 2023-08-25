package practice;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class SeleniumAssignmentDay4 {
	@Test
	public void addQuestion() {
	
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
		
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Content"+Keys.ENTER);
		
		driver.findElement(By.xpath("//mark[text()='Content']/ancestor::a")).click();
		
		WebElement chatterElement = driver.findElement(By.xpath("//span[text()='Chatter']/parent::a"));
		driver.executeScript("arguments[0].click()", chatterElement);
		
		WebElement quetionElement = driver.findElement(By.xpath("//span[text()='Question']/ancestor::a"));
		driver.executeScript("arguments[0].click()", quetionElement);
		
		driver.findElement(By.tagName("textarea")).sendKeys("Hello from SDET");
		
		driver.findElement(By.xpath("//div[contains(@data-placeholder,'If you have')]")).sendKeys("Hello SDET!!!");
		
		driver.findElement(By.xpath("//button[contains(text(),'Ask')]")).click();
		
		String myQuestion = driver.findElement(By.xpath("//span[@class='uiOutputText' and text()='Hello from SDET']")).getText();
		
		if(myQuestion.contains("Hello from SDET")) {
			System.out.println("Verified Added Quetion Availble in the Page");
		}
	}
}
