package Day10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homework {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\ernes\\eclipse-workspace\\SeleniumTools\\chromeDriver\\chromedriver.exe");
		

	}

	public static void Test1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 5);

		Actions letsDo = new Actions(driver);

		// go to "http://practice.primetech-apps.com/practice/drag-and-drop"
		driver.get("http://practice.primetech-apps.com/practice/drag-and-drop");
		// Verify Drag And Drop text displays
		
		// drag the Text element to target window
		// drag the Textarea element to target window
		// drag the Number element to target window
		// delete all those dragged items from target window

	}

}
