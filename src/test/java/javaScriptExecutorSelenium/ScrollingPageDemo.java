package javaScriptExecutorSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollingPageDemo {				
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1. Scroll down page by pixel number
		
		//js.executeScript("window.scrollBy(0,1000)","");
		//System.out.println(js.executeScript("return window.pageYOffset"));
		
		//2. Scroll the page till element is visible
		
		//WebElement ele = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		
		//js.executeScript("arguments[0].scrollIntoView()",ele);
		//System.out.println(js.executeScript("return window.pageYOffset"));
		
		//3. scroll page till end of the page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));
		
		Thread.sleep(5000);	
		
		//4. scroll up to initial position 
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
			
		
	}

}
	