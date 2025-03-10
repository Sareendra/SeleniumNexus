package datepickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Datepickers {
	
	
	//select month and year
	static void selectMonthAndYear (WebDriver driver,String month,String year) {
		while (true) {
			String currentMonth  = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			
			if (currentMonth.equals(month)&&currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
	}
	
	
	
	static void selectDate(WebDriver driver,String date) {
		List<WebElement> allDates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td//a"));
		
			for(WebElement dt:allDates) {
				
				if(dt.getText().equals(date)) {
					dt.click();
					break;
				}
		}
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//method 1 : using send keys		
		//driver.findElement(By.xpath("//input[@id='date picker']")).sendKeys("04/02/2025");
		
		//method 2 : using date pickers to select month and year
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String year = "2025";
		String month = "May";
		String date = "25";
		
		
		selectMonthAndYear(driver, month, year)	;
		selectDate(driver, date);
		
		
		System.out.println("Program has successfully completed");
		
		
		
	}

}
