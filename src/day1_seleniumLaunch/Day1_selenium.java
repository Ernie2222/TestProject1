package day1_seleniumLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\ernes\\eclipse-workspace\\SeleniumTools\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Gym clothes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		// find by name
		// driver.findElement(By.name("q").sendKeys("software test engineer"));

		driver.findElement(By.linkText("Customer Service")).click();
		driver.findElement(By.className("fs-match-card")).click();
		driver.findElement(By.name("email").sendKeys("itsernestoespinoza@gmail.com");

	}

}
