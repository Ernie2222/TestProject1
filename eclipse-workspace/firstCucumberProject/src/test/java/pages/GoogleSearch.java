package pages;



import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

public class GoogleSearch {
	WebDriver driver;
	
	@Given("I am on the google search")
	public void i_am_on_the_google_search() {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\ernes\\eclipse-workspace\\SeleniumTools\\chromeDriver\\chromedriver.exe");
		driver.manage().window().maximize();
	    Driver.getDriver().get("www.google.com");
	}
	@When("I search for {string}")
	public void i_search_for(String string) {
		System.out.println("hello");
	   
	}
	@Then("the page title should start with {string}")
	public void the_page_title_should_start_with(String string) {
	   System.out.println("hi");
	}

}
