package handleDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry = new Select(drpCountryEle);
		
		//Type 1 Select the element from the Drop down
		
		// Select By Text
		//drpCountry.selectByVisibleText("France");
		
		//Select By value
		//drpCountry.selectByValue("uk");
		
		//Select By Index
		//drpCountry.selectByIndex(5);
		
		//Type 2 Count the no of Web elements inside the drop down 
		
		List<WebElement> opts = drpCountry.getOptions();
		
		//System.out.println("No of Web Elements in the drop down: "+opts.size());
		
		//Type 3 Print the elements inside the drop down
		
		System.out.println();
		System.out.println("List of countries inside the drop down\n");
		
		//classical for loop
//		for(int i=0;i<opts.size();i++) {
//			
//			System.out.println(opts.get(i).getText());
//						
//		}
		
		//Enhanced for loop
		
		for(WebElement op:opts) {
			System.out.println(op.getText());
			
		}
	}

}
