package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {

		// Win:
		// System.setProperty("webdriver.chrome.driver",
		// "c:\\users\\naveen\\geckodriver.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DY\\Downloads\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "‪C:\\Users\\DY\\Downloads\\geckodriver.exe");
		

		//FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com");// enter url

		String title = driver.getTitle();// get the title of the page
		System.out.println("page title is: " + title);

		// verification point: checkpoint (actual vs expected result)
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("in-correct title");
		}

		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		 driver.quit();//close the browser

	}

}