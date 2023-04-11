package Day8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework_day7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\ernes\\eclipse-workspace\\SeleniumTools\\chromeDriver\\chromedriver.exe");
		amazonSelect();

	}

	public static void amazonSelect() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		String expectedTitle = "Amazon.com. Spend less. Smile more.";
		if (driver.getTitle().equals(expectedTitle)) {
			System.out.println("We are on the Home Page!");
		} else {
			System.out.println("We are not on the Home Page!");
		}

		String defaultDropdownValue = "All Departments";
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select letSelect = new Select(dropdown);
		List<WebElement> actualSelectedOption = letSelect.getAllSelectedOptions();
		if (actualSelectedOption.equals(defaultDropdownValue)) {
			System.out.println("Default dropdown value matches.");
		} else {
			System.out.println("Default dropdown value does not match.");
		}

		String searchItem = "Coffee Mug";
		letSelect.selectByVisibleText("Home & Kitchen");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);

		String itemPageTitle = driver.getTitle();
		int beginningIndex = itemPageTitle.length() - searchItem.length();
		if (itemPageTitle.substring(beginningIndex).equals(searchItem)) {
			System.out.println("Search item title match");
		} else {
			System.out.println("Search item title does not match");
		}
		WebElement dropdown2 = driver.findElement(By.id("searchDropdownBox"));
		Select letSelect2 = new Select(dropdown);

	}

}
