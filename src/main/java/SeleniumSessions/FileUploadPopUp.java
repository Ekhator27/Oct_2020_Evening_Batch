package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUploadPopUp {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DY\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type="file" should be there
		
		driver.findElement(By.name("upfile")).sendKeys("/Users/naveenautomationlabs/Downloads/unnamed.gif");
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
	}

}