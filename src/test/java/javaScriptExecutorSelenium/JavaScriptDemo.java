package javaScriptExecutorSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.AllArguments;

public class JavaScriptDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();  // Approach 1
		//ChromeDriver driver = new ChromeDriver(); // Approach 2
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		
		//Passing the text into inputbox - alternate of sendKeys()
		JavascriptExecutor js = (JavascriptExecutor) driver; // upcasting
		//JavascriptExecutor js = driver;   // NO need to type if we go with Approach 2 
		
		js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
		//arguments[0] , the 2nd parameter value will be stored in the array argument
		
		
		//clicking on element - alternate of click()
		//Without using send keys method
		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",radiobtn);
		
				
	}

}
