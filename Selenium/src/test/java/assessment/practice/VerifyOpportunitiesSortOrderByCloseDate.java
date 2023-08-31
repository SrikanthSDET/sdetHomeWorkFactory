package assessment.practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyOpportunitiesSortOrderByCloseDate {
	@Test
	public void verifyOpportunitiesSortOrderByCloseDate() {
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("srikanth.murugavel@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("SDETj@#2023");
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'appLauncher')]")).click();
				
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		WebElement OppTabElement = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		
		driver.executeScript("arguments[0].click()", OppTabElement);
		
		List<WebElement> closeDateBeforeSort = driver.findElements(By.xpath("//span[@class='uiOutputDate']"));
		
		List<String> dateBfSort = new ArrayList<String>();
		
		for (WebElement webElement : closeDateBeforeSort) {
			dateBfSort.add(webElement.getText());
		}
		
		driver.findElement(By.xpath("//span[text()='Display as Table']/ancestor::button")).click();
		
		driver.findElement(By.xpath("//li[@title='Table']/a")).click();
		
		WebElement closeDateLinkElement = driver.findElement(By.xpath("//span[text()='Close Date']/.."));
		
		closeDateLinkElement.click();	
		
		closeDateLinkElement.click();
		
		WebElement sortingElementStatus = driver.findElement(By.xpath("//span[text()='Close Date']/parent::a/following-sibling::span"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElement(sortingElementStatus, "Sorted Ascending"));
		
		String closeDateOrderStatusText = sortingElementStatus.getText();
		
		Assert.assertEquals(closeDateOrderStatusText,"Sorted Ascending");
		
		List<WebElement> claseDateAfterSort = driver.findElements(By.xpath("//span[@class='uiOutputDate']"));
		
		List<String> dateAfSort = new ArrayList<String>();
		
		for (WebElement webElement : claseDateAfterSort) {
			dateAfSort.add(webElement.getText());
		}
		
		Assert.assertTrue(!dateBfSort.equals(dateAfSort));
		
		driver.close();
	}

}
