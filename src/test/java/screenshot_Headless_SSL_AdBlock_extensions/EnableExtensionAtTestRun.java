package screenshot_Headless_SSL_AdBlock_extensions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionAtTestRun {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		
		
		
		File file = new File("D:\\Sareendra\\Career\\crx_files\\SelectorsHub.crx");
		
		options.addExtensions(file);
				
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		
		
		
		//only through extension we can block ads, so we need to enable extension during runtime
		
		
		
	}

}
