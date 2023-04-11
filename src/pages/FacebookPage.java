package pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {
	
	public FacebookPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
		@FindBy (name = "email")
		public WebElement FBemailField;
}
