package xpath_locators_path_function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;

public class Xpath_locatoes_function {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
		
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirts");
		
		
		
		// Xpath with multiple attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search'][@name=\"search\"]")).sendKeys("TShirt");
		
		// xpath with 'and' operator
		
		//driver.findElement(By.xpath("input[@placeholder='Search' and @name=\"search\"]")).sendKeys("Shirt");
		
		//xpath with 'or' operator
		
		//driver.findElement(By.xpath("input[@placeholder='xyz' and @name=\"search\"]")).sendKeys("Shirt");
		
		//xpath with text()
		
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		//boolean displayStatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		//System.out.println(displayStatus);
		
		
		//String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		//System.out.println(value);
		
		//xpath with contains()
		//driver.findElement(By.xpath("//input[contains(@name,'sea')] ")).sendKeys("Laptop");
		
		//xpath with starts-with()
		//driver.findElement(By.xpath("//input[starts-with(@name,'sea')] ")).sendKeys("Laptop");
		
		//chained xpath
		boolean imgstatus= driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(imgstatus);
		
			
	}
	
	

}
