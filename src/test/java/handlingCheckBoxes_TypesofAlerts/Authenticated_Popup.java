package handlingCheckBoxes_TypesofAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticated_Popup {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		// Syntax : http://username:password@the-internet.herokuapp.com/basic_auth  
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.manage().window().maximize();
		
		
		
		
	}

}
