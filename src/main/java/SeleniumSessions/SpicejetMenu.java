package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SpicejetMenu {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DY\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		By addOnsLink = By.linkText("ADD-ONS");
		By travelInsurance = By.linkText("Travel Insurance");
		By subMenustudentDis = By.linkText("Student Discount");

		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickOnSubMenu(addOnsLink, travelInsurance);
		eleUtil.clickOnSubMenu(addOnsLink, subMenustudentDis);

	}

}