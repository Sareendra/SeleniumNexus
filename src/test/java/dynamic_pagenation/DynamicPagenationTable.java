package dynamic_pagenation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicPagenationTable {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		
		WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//close window if available 
		
//		if (driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
//			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
//		}
		
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		
		//String showing Showing 1 to 10 of 17751 (1776 Pages)
		String text =  driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1))  ;
		
		System.out.println("Total number of pages: "+total_pages);
		
		for(int p=1; p<=8; p++) {
			
			if (p>1) {
				//WebElement active_page=  driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				
		        WebElement element = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]")); 
		        Actions actions = new Actions(driver);
		        actions.moveToElement(element).perform();
		        element.click();
				Thread.sleep(3000);
				
			}
			//reading data from the page
			
			int noOfRows = driver.findElements(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr")).size();
			System.out.println(noOfRows);
			
			for (int r=1;r<=noOfRows;r++) {
				String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[2]")).getText();
				
				String email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr[\"+r+\"]/td[3]")).getText();
				
				System.out.println(customerName+"\t"+email+"\t");
				
			}
			
			
		}
		
	}
}
