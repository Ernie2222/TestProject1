package Day_2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookActivities {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\ernes\\eclipse-workspace\\SeleniumTools\\chromeDriver\\chromedriver.exe");

		FacebookActivities fb = new FacebookActivities();
		fb.testcase1();
		fb.testcase2();
		fb.getTextPractice();
	}

	public void testcase1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://Facebook.com");
		driver.findElement(By.id("email")).sendKeys("automation");
		driver.findElement(By.id("pass")).sendKeys("aut0mation");
		driver.findElement(By.className("_6ltg")).click();
		Thread.sleep(4000);
		driver.close();

	}

	public void testcase2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("automation");
		driver.findElement(By.name("lastname")).sendKeys("automation");
		driver.findElement(By.name("reg_email__")).sendKeys("automation");
		driver.findElement(By.name("reg_passwd__")).sendKeys("automation");
		driver.findElement(By.name("websubmit")).click();
		driver.close();
	}

	public void getTextPractice() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");

		String loginText = driver.findElement(By.name("login")).getText();
		System.out.println("Log in button text is: " + loginText);
		if (loginText.equals("Log In")) {
			System.out.println("Test Pass!");
		} else {
			System.out.println("Test Fail! Text doesn't equal");
		}

	}

}
