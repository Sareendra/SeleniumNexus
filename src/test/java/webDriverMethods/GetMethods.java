package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		//get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//getTitle
		System.out.print(driver.getTitle()) ;
		
		//getCurrentUrl
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource()
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle()
		//String windowId = driver.getWindowHandle();
		//System.out.println("Window Id "+windowId); //5EF3F27174F736F1684CDC9DF5F524CC
		
		//getWindowHandles()
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open new browser window
		
		Set<String> windowsIds = driver.getWindowHandles();
		System.out.println(windowsIds);
		
	}

}
