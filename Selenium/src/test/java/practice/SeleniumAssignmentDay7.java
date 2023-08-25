package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class SeleniumAssignmentDay7 {
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
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windowList = new ArrayList<String>(windowHandles);
		for (String string : windowList) {
			if(!string.equals(parentWindow)) {
				driver.switchTo().window(string);
				break;
			}
		}		
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		
		List<String> windowList1 = new ArrayList<String>(windowHandles2);
		for (String string1 : windowList1) {
			if(!string1.equals(parentWindow)) {
				driver.switchTo().window(string1);
				break;
			}
			}
		
		String titleChildWindow = driver.getTitle();
		System.out.println("Child Window Title: "+titleChildWindow);
		
		driver.close();
		driver.switchTo().window(parentWindow);
		
		String titleParentWindow = driver.getTitle();
		System.out.println("Parent Window Title: "+titleParentWindow);
		driver.close();
		
		}
	
		
	}

