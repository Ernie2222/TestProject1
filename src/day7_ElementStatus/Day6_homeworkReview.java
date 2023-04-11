package day7_ElementStatus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_homeworkReview {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\ernes\\eclipse-workspace\\SeleniumTools\\chromeDriver\\chromedriver.exe");

		//radioButtonHomework();
		checkboxHomework();
	}

	public static void radioButtonHomework() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://practice.primetech-apps.com/practice/radio-button");

		List<WebElement> radioButtons = driver.findElements(By.cssSelector(".form-check-input"));
		for (WebElement singleRadio : radioButtons) {
			if (singleRadio.isDisplayed() && singleRadio.isEnabled()) {
				if (singleRadio.isSelected()) {
					System.out.println("radio button is selected!");
				} else {
					System.out.println("radio button is not selected!");
					Thread.sleep(1000);
					singleRadio.click();
				}
			} else {
				System.out.println("Something is not right. Either not diplayed or enabled.");
			}
			Thread.sleep(1000);
			System.out.println("Is radio button selected " + singleRadio.isSelected());

		}

	}

	public static void checkboxHomework() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(" http://practice.primetech-apps.com/practice/check-box");
		List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[class=form-check-input]"));
		
		for (WebElement singleCheckbox : checkBoxes) {
			if (singleCheckbox.isDisplayed()) {
				System.out.println("Its Displayed.");
				if (singleCheckbox.isEnabled()) {
					System.out.println("Its enabled.");
					if (singleCheckbox.isSelected()) {
						System.out.println("Its Selected");
					} else {
						System.out.println("Its not selected so I am selecting it. Clicking");
						
						singleCheckbox.click();
						
					}

				} else {
					System.out.println("Its not enabled");
				}

			} else {
				System.out.println("Its not Displayed");
			}
			
		} 
		driver.close();
	}

}
