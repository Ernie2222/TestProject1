package Day10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\ernes\\eclipse-workspace\\SeleniumTools\\chromeDriver\\chromedriver.exe");
		Test1();
	}
	
	public static void Test1() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://indeed.com");
		
		driver.findElement(By.xpath("//*[@id=\"gnav-footer-container\"]/div/footer/div/ul[1]/li[5]/a")).click();
			
		if(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div/div[2]/div[2]/div/div[1]/h1")).isDisplayed()) {
			System.out.println("We are on the correct page");
		}else {
			System.out.println("We are lost!!");
		}
		
	}

	
	
}
