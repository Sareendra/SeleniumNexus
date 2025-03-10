package handlingCheckBoxes_TypesofAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert_Popups {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		// Normal Alert only OK button
		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//		
//		Thread.sleep(5000);
		
//		driver.switchTo().alert().accept();
		
//		Alert myalert = driver.switchTo().alert();
		
//		System.out.println(myalert.getText());
//		myalert.accept();
		
		//Confirmation alert OK + cancel button
		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		
//		Thread.sleep(3000);
		
//		driver.switchTo().alert().accept();
		
//		driver.switchTo().alert().dismiss();
		
		
		//Prompt alert OK + cancel button along with input box
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		
		Alert myalert = driver.switchTo().alert();
		
		myalert.sendKeys("Welcome Sareendra..!!");
		myalert.accept();
		
		
		 
		
		
		
	}

}
