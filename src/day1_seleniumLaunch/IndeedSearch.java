package day1_seleniumLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeedSearch {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\ernes\\eclipse-workspace\\SeleniumTools\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://indeed.com");
		driver.findElement(By.id("text-input-where")).sendKeys("Nanny");
		
		
		
	}

}
