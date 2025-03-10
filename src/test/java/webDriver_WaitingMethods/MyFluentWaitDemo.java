package webDriver_WaitingMethods;

import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
public class MyFluentWaitDemo {
	
	 public MyFluentWaitDemo(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		 // Set up WebDriver (ensure Chrome driver executable is in your PATH)
	        WebDriver driver = new ChromeDriver();

	        // FluentWait declaration
	        Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
	                .withTimeout(Duration.ofSeconds(30)) // Maximum wait time
	                .pollingEvery(Duration.ofSeconds(5)) // Polling interval
	                .ignoring(NoSuchElementException.class); // Ignore specific exceptions
	        
	      

	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.manage().window().maximize();
	        
	        //driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");

	        WebElement txtUsername = mywait.until(new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	              return driver.findElement(By.xpath("//input[@placeholder='username']"));     
	            }
	        });
	        
	         

	        // Interact with the element
	        txtUsername.sendKeys("Admin");

	        // Close the browser
	        driver.close();
	    }

	
	}
