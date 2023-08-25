package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectClassPractice {
	@Test
	public void selectElement() {

		
		ChromeDriver driver = new ChromeDriver();		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement selectEle = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		
		Select obj = new Select(selectEle);
		
		boolean multiple = obj.isMultiple();
		
		List<WebElement> options = obj.getOptions();
		
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		
		//obj.selectByIndex(0);
	}
}
