package handlingCheckBoxes_TypesofAlerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlecheckBoxes {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Select the specific check box
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//Select the all check boxes
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));

//		type 1		
//		for(WebElement checkbox : checkboxes )
//		{
//			checkbox.click();
//		}
//		type 2
//		for(int i=0; i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
//		type 3
		
		// select last 3 check boxes
		// starting index = total no of check boxes - how many last check boxes to select
		
//		for (int i=4; i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
		
		// Unselect check boxes if they selected 
		for(WebElement checkbox: checkboxes) {
			checkbox.click();
		}
		
		Thread.sleep(5000);
		
		for (int i=0; i<checkboxes.size();i++) {
			if (checkboxes.get(i).isSelected()){
				checkboxes.get(i).click();
			}
		}
	
		
	}
}
