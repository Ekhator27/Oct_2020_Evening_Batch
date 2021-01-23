package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DY\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Naveen AutomationLabs");

		Thread.sleep(3000);

		List<WebElement> suggestionList = driver.findElements(By.xpath("//div[@class='sbl1']/span"));

		System.out.println(suggestionList.size());

		for (WebElement e : suggestionList) {

			String text = e.getText();
			System.out.println(text);

			if (text.equals("naveen automationlabs cucumber")) {
				e.click();
				break;
			}

		}

	}

}