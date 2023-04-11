package day7_ElementStatus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"\\Users\\ernes\\eclipse-workspace\\SeleniumTools\\chromeDriver\\chromedriver.exe");
		//dropdownDemo();
		nonSelectDropdown();

	}

	public static void dropdownDemo() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
	
	public static void nonSelectDropdown() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.findElement(By.xpath("//div[@class='ui fluid selection dropdown'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='matt']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
	}
	
	
	

}
