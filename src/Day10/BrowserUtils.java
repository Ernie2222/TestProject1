package Day10;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

	WebDriverWait wait;
	JavascriptExecutor js;
	
	
	// this method clears the text of the given element
	public void clearText(WebElement element) {
		
		String temp = element.getAttribute("value");
		for(int i = 0; i<temp.length(); i++ ) {
			element.sendKeys(Keys.BACK_SPACE);
		}
	}
	
	public void waitForElementVisible(WebElement element) {
		
		wait = new WebDriverWait(Driver.getDriver(), 5);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void scrollToElement (WebElement element) {
	
		js =(JavascriptExecutor) Driver.getDriver();
		//js.executeScript("alert('PrimeTech School!');");
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}

	
	
	
}
