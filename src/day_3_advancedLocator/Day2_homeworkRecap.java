package day_3_advancedLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_homeworkRecap {
	
public static void main(String[] args) {
		
		Day2_homeworkRecap etsy = new Day2_homeworkRecap();
		etsy.EtsyHomework();
		
	}
	
	
	public void EtsyHomework() {
		
		WebDriver driver = new ChromeDriver();
		driver.get();
		driver.findElement(By.className("signin-header-action")).click();
		
		
	}
	
	
	
	
	
	
}
