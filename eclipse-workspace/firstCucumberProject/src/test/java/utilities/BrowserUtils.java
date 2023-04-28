package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {
	
	Actions actions;
	WebDriverWait wait;
	Select letsSelect;
	
	public void waitUntilElementVisible(WebElement element) {
		
	}
	
	public void actionsSendKeys(WebElement element, String text) {
		actions = new Actions(Driver.getDriver());
		actions.sendKeys(element, text).build().perform();
	}
	// select by visible text
	public void selectByVisableText(WebElement selectElement, String tobeSelectedOptionText) {
		letsSelect = new Select(selectElement);
		letsSelect.selectByVisibleText(tobeSelectedOptionText);
		
	}
	// return the selected option from the dropdown
	public String getSelectedOption(WebElement selectElement) {
		letsSelect = new Select(selectElement);
		String option = letsSelect.getFirstSelectedOption().getText();
		return option;
	}

}
