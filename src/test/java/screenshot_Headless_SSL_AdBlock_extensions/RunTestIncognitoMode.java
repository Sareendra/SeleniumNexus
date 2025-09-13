package screenshot_Headless_SSL_AdBlock_extensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestIncognitoMode {
	
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		
		
		String title = driver.getTitle();
		if (title.equals("Your Store")) {
			System.out.println("Test Passed");
			
		}
		else {
			System.out.println("Test Failed");
		}
		
				
	}

}
