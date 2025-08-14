package screenshot_Headless_SSL_AdBlock_extensions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrenShots {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1) full page screenshot
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		
		
		/*

		 
		//Static filelocation
		//File targetfile = new File("D:\\Sareendra\\Qspider\\Automation\\workspace\\Selenium_WebDriver\\seleniumWebDriver\\screenshots\\fullpage.png");
		
		
		
		//dynamic filelocation
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		
		sourcefile.renameTo(targetfile); // copy sourcefile to target file
		
		
		*/
		
		
		
		/*
		//2) capture the screenshot of specific section
		WebElement featureProducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File sourcefile2 = featureProducts.getScreenshotAs(OutputType.FILE);
		File targetfile2 = new File(System.getProperty("user.dir")+"\\screenshots\\featureproducts.png");
		sourcefile2.renameTo(targetfile2);  // copy sourcefile to target file
		
		
		
		
		*/
		
		//3) capture the screenshot of webelement
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile3 = logo.getScreenshotAs(OutputType.FILE);
		
		File targetfile3 = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		sourcefile3.renameTo(targetfile3);
		
		driver.quit();
		
		
		
	}

}