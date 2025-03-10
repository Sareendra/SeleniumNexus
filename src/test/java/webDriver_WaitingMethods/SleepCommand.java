package webDriver_WaitingMethods;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));//Implicit wait
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");
		
		driver.close();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
