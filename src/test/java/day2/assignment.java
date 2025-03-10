package day2;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Untainted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/index.html");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links: "+links.size());
		
		for(int i=0; i<links.size(); i++) {
			System.out.println("Linktext on page are "+links.get(i).getText());
			System.out.println("Link on page are "+links.get(i).getAttribute("href"));
			System.out.println();
		}
		
		
		List <WebElement> img = driver.findElements(By.xpath("//img"));
		System.out.println("\nTotal no of images: "+img.size());
		
		
		driver.findElement(By.linkText("Samsung galaxy s6")).click();
		
		
 	}

}
