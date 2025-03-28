package mouseHoverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
				
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops (13)']"));
		WebElement mac =  driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act = new Actions(driver);
		
		//Mouse hover
		//act.moveToElement(desktop).moveToElement(mac).click().build().perform();
		
		act.moveToElement(desktop).moveToElement(mac).click().perform();
		
			
		
	}

}
