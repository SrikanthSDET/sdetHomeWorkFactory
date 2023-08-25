package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class SeleniumAssignmentDay6 {
	@Test
	public void addQuestion() {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		String alertActiontext = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		if(alertActiontext.contains("OK")) {
			System.out.println("You have Pressed Ok Buuton in the Alert");
		}else {
			System.out.println("You have Pressed Cancel Buuton in the Alert");
		}
	}
}
