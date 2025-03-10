package mouseHoverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame("iframeResult");

		//input[@id='field1']
		//input[@id='field2']
		//button[normalize-space()='Copy Text']
		
		 WebElement box1 =  driver.findElement(By.xpath("//input[@id='field1']"));		  
		 WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		 WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		 
		 box1.clear();
		 box1.sendKeys("Welcome");
		 
		 //Double click action on button
		 Actions act = new Actions(driver);
		 
		 act.doubleClick(button).perform();
		 
		 //validation : box2 should contains "Welcome"
		 
		 
		 //Method 1
//		 if(box2.getText().equals(box1.getText())) {
//			 System.out.println(box1.getText()+" text copied.....");
//		 }
//		 else {
//			System.out.println("Text not copied....");
//		}
		 
		 
		 //Method 2
		 String text = box2.getAttribute("value");
		 
		 System.out.println("Captured value: "+text);
		 
		 if (text.equals("Welcome")) {
			System.out.println("Text copied...");
		}
		 else {
			System.out.println("Text not copied...");
		}
		 
		 
		
	}

}
