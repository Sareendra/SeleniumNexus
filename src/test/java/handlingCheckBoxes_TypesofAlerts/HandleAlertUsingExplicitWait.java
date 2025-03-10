package handlingCheckBoxes_TypesofAlerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10)); //Declaration of explicit wait 
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");;
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(3000);
		
		
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(myalert.getText());
		myalert.accept();
		
				
	}

}
