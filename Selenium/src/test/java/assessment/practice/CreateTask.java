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

public class CreateTask {
	@Test
	public void createTask() {
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
		
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("tasks");
		
		WebElement tasksElement = driver.findElement(By.xpath("//a[@data-label='Tasks']"));		
		
		wait.until(ExpectedConditions.elementToBeClickable(tasksElement));
		
		driver.executeScript("arguments[0].click()", tasksElement);
		
		WebElement TasksTabElement = driver.findElement(By.xpath("//span[text()='Tasks List']/parent::a//*[@part='icon']/.."));
		
		driver.executeScript("arguments[0].click()", TasksTabElement);
		
		WebElement newTaskElement = driver.findElement(By.xpath("//span[text()='New Task']/ancestor::a"));
	
		driver.executeScript("arguments[0].click()", newTaskElement);
		
		driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("Bootcamp");
		
		driver.findElement(By.xpath("//a[@role='button' and @class='select']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Waiting on someone else')]")).click();
		
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		
		String taskCreationConfirmation = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		
		Assert.assertTrue(taskCreationConfirmation.contains("Bootcamp"));
		
		driver.close();
	}

}
