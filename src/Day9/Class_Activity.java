package Day9;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class_Activity {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\ernes\\eclipse-workspace\\SeleniumTools\\chromeDriver\\chromedriver.exe");
		actionsDemo();
	}

	public static void actionsDemo() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		Actions letsDo = new Actions(driver);
		
		driver.get("https://etsy.com");
		
		WebElement jewelaryTab = driver.findElement(By.xpath("//*[@id=\"catnav-primary-link-10855\"]"));
		letsDo.moveToElement(jewelaryTab).build().perform();
		Thread.sleep(2000);

		WebElement bagsPurses = driver.findElement(By.xpath("//*[@id=\"side-nav-category-link-10865\"]"));
		letsDo.moveToElement(bagsPurses).build().perform();
		Thread.sleep(2000);
		
		WebElement shoulderBags = driver.findElement(By.xpath("//*[@id=\"catnav-l4-10869\"]"));
		letsDo.moveToElement(shoulderBags).build().perform();
		Thread.sleep(2000);
		
		shoulderBags.click();
		Thread.sleep(2000);
		

	}

}
