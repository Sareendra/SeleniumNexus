package handling_auto_sugesstion_static_web_table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.network.AuthChallenge;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Table {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractise.bllogspot.com");
		driver.manage().window().maximize();
		
		//1> to find total number of rows
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows "+rows);
		
		
		int row = driver.findElements(By.tagName("tr")).size();// this will return all the rows in the web page
		System.out.println("Number of rows "+row);
		
		
		// 2> to find total number of columns 
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of columns "+cols);
		
		//3> Read specific data from the table
		
		String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[7]")).getText();
		System.out.println(bookname);
		
		//4> Read all data from the table
		for(int r=2;r<=rows; r++) {
			for(int c=1; c<=cols; c++) {
				
				String value = driver.findElement(By.xpath("table[@name='BookTable']//tr['+r+']//td['+c+']")).getText();
				
				System.out.println(value+"/t");				
			}
		}
		
		
		//5> print book author name who author is mukesh
		
		for(int r=2; r<=rows;r++) {
			String authName = driver.findElement(By.xpath("table[@name='BookTable']//tr['+r+']//td[2]")).getText();
			
			if (authName.equals("Mukesk")) {
				String book_name = driver.findElement(By.xpath("table[@name='BookTable']//tr['+r+']//td[1]")).getText();
				
				System.out.println(authName+"/t"+book_name);
			}
			
			
		}
		
		
		
		//6> find the total price of all the books
		
		int total = 0;
		
		
		for(int r=2; r<=rows; r++) {
			String price = driver.findElement(By.xpath("table[@name='BookTable']//tr['+r+']//td[4]")).getText();
			
			total = total+Integer.parseInt(price);
		}
		System.out.println("total price of all the books "+total);
		
		
	}

}
