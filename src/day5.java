import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\ernes\\eclipse-workspace\\SeleniumTools\\chromeDriver\\chromedriver.exe");

		// Test1();
		Test2();

	}

	public static void Test1() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Coffee mug");
		driver.findElement(By.id("nav-search-submit-button")).click();

	}

	public static void Test2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// go to https://saucedemo.com
		driver.get("https://www.saucedemo.com/");
		// log in with username = standard_user password = secret_sauce
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		// find all the results and get them in a list, and print the size of the list.
		List<WebElement> items = driver.findElements(By.cssSelector(".inventory_item"));
		int listSize = items.size();
		System.out.println(listSize);

		List<WebElement> itemPrices = driver.findElements(By.cssSelector(".inventory_item_price"));
		for (int i = 0; i < itemPrices.size(); i++) {
			itemPrices.get(i).getText();
			System.out.println(itemPrices.get(i).getText());

		}
	}

}
