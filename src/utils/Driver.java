package utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Driver {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\ernes\\eclipse-workspace\\SeleniumTools\\chromeDriver\\chromedriver.exe");
		if(driver == null) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		return driver;
	}
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
	
	
	public static void dropdownDemo() throws InterruptedException {

		driver.get("https://amazon.com");

		WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));
		Select choose = new Select(selectElement);
		WebElement firstSelectedOption = choose.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		choose.selectByVisibleText("Home & Kitchen");

		Thread.sleep(1000);
		choose.selectByIndex(1);
		Thread.sleep(1000);
		choose.selectByValue("search-alias=stripbooks");

		System.out.println(choose.getFirstSelectedOption().getText());
		List<WebElement> allOptions = choose.getOptions();
		System.out.println(allOptions.size());
		for (WebElement element : allOptions) {
			System.out.println(element.getText());
		}

	}
	
	
	
	
}
