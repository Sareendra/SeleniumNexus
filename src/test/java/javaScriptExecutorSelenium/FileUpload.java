package javaScriptExecutorSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
		
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("\"https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		/*
		//single file upload -Test1.txt
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Automation\\automatedFiles\\Test1.txt");
		
		
			if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Test1.txt")){
			
				
				System.out.println("Files is sucessfully uploaded");	
			}
			else{
				
				System.out.println("Upload failed");			
				
			}
			
			*/
		
		
		
			//Multiple files		
			
			String file1= "C:\\Automation\\automatedFiles\\Test1.txt";
			String file2= "C:\\Automation\\automatedFiles\\Test2.txt";
			
			
			driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
			
			int noOfFilesUpLoaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
			
			
			//Validation1 - Number of files
			
				if(noOfFilesUpLoaded==2){
					
					System.out.println("All files are uploaded");				
					
				}
				else{
					
					System.out.println("Files are not uploaded");
					
				}
				
			//Validation2 - files names
			
				if (driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Test1.txt")&&driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Test2.txt")){
					
					
					System.out.println("File name matching");
				}
				
				else {
					System.out.println("File name are not matching");
				}
				

		
	}

}
