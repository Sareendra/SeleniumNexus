package day1;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 1. Launch browser(chrome)
 2. Open URL https://demo.opencart.com/
 3.Validate title should be "Your Store"
 4. Close browser
 */
public class firstTestCase {
	public static void main(String[] args) {
		
		//1. Launch browser(chrome)
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//2. Open URL https://demo.opencart.com/
		
		driver.get("https://demo.opencart.com/");
		
		//3.Validate title should be "Your Store"
		
		String act_title = driver.getTitle();
		
		if (act_title.equals("Your Store")) {
			System.out.println("Test Passed");
			
		}
		else {
			System.out.println("Test Failed");
			
		}
		
		
		//4. Close browser
		driver.close();
		/* driver.quit(); */
		
	}

}
