package keyboardActionsAndSilder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindow {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		// Introduced in selenium4.x
		//driver.switchTo().newWindow(WindowType.TAB);  //open new tab
		
		driver.switchTo().newWindow(WindowType.WINDOW);  //open new window
		
		
		driver.get("https://orangehrm.com/");
		
	}

}
