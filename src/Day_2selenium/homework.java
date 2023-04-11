package Day_2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\ernes\\eclipse-workspace\\SeleniumTools\\chromeDriver\\chromedriver.exe");

		homework indeed = new homework();
		indeed.testCase1();

	}

	public void testCase1() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://Indeed.com");
		driver.findElement(By.className("gnav-header-xbwdtc eac13zx0")).click();
		

	}

}
