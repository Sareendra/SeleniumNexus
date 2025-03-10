package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();// To maximize the browser window
		
		
		//name
		driver.findElement(By.name("search")).sendKeys("Mac");
				
		
		//id
		boolean logoDisplayedStatus =driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplayedStatus);
		
		//linktext & partialLinkText
		
		driver.findElement(By.linkText("Tablets")).click(); //recommended		
		driver.findElement(By.partialLinkText("Table")).click();
		
		//className
		List<WebElement> headerLinks= driver.findElements(By.className("list-inline-item"));
		System.out.println("Total no of header links: "+headerLinks.size());//this will return total no of elements
		
		
		//tagName
		
		List<WebElement> links =driver.findElements(By.tagName("a"));		
		System.out.println("total no of links: "+links.size());
		
		
		List<WebElement> images =driver.findElements(By.tagName("img"));		
		System.out.println("total no of images: "+images.size());
		
		
	}

}
