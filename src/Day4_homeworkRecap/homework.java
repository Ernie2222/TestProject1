package Day4_homeworkRecap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import day_3_advancedLocator.Xpath_demo;

public class homework {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\ernes\\eclipse-workspace\\SeleniumTools\\chromeDriver\\chromedriver.exe");
		homework fb = new homework();
		fb.indeedTestCase3();
		
		
	}
	
	public static void facebookTestCase1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("automation");
		
		
	}
	
	public static void indeedTestCase3() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.indeed.com");
		
		String homeURL = driver.getCurrentUrl();
		String homeTitle = driver.getTitle();
		String jobSearchName = "SDET";
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(jobSearchName);
		WebElement whereField = driver.findElement(By.xpath("//input[@name='l']"));
		whereField.sendKeys(Keys.COMMAND + "a");
		whereField.sendKeys(Keys.DELETE);
		
		
		String locationText = whereField.getAttribute("value");
		for (int i = 0; i < locationText.length(); i++) {
			whereField.sendKeys(Keys.BACK_SPACE);
		}
		
		driver.findElement(By.xpath("//button")).click();
		
		
		
		
	}
	
	
	

}
