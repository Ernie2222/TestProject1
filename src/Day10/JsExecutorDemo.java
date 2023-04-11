package Day10;

import org.openqa.selenium.JavascriptExecutor;

public class JsExecutorDemo {
	
	public static void main(String[] args) {
		JavascriptExecutor driver = null;
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("alert('SW Test Academy!');");
	}

}
