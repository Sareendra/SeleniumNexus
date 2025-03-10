package webDriverMethods;

import java.sql.Driver;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//isDisplayed()
		//WebElement logoElement =  driver.findElement(By.xpath("//img[@alt='orangehrm-logo']"));
		
		//System.out.println("Display statue of logo: "+logoElement.isDisplayed());
		
		//isEnabled()
		
		//boolean status=driver.findElement(By.xpath("//input[@placeholder='Username']")).isEnabled();
		
		//System.out.println("Enable status: "+status);
		
		
		
		//isSelected
		WebElement male_rd =driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id=gender-female]"));
		
		//System.out.println("Before selection..........");
		//System.out.println(male_rd.isSelected()); //false
		//System.out.println(female_rd.isSelected()); //false
		
		
		driver.close();
		
		
	}
	

}
