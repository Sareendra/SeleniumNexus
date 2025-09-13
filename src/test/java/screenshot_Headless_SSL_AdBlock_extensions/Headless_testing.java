package screenshot_Headless_SSL_AdBlock_extensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_testing {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new"); // setting for headless mode of execution
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		
		
		String act_title = driver.getTitle();
		
		if(act_title.equals("Your Store")) {
			System.out.println("Test passed");
		}
		
		else {
			System.out.println("Test Fail");
		}
	}

}
