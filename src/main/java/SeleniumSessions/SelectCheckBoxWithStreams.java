package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelectCheckBoxWithStreams {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DY\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		List<WebElement> checkBoxList = driver.findElements(By.cssSelector("td.select-checkbox"));
		
		System.out.println(checkBoxList.size());
		
		//checkBoxList.parallelStream().forEach(ele -> ele.click());
		
		
		
	}

}