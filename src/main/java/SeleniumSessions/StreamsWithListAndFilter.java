package SeleniumSessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StreamsWithListAndFilter {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DY\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		System.out.println(linksList.size());
		
//		List<String> collectList = linksList.stream()
//						.filter(ele -> !ele.getText().equals(""))
//						.map(ele -> ele.getText())
//						.collect(Collectors.toList());
//						
//		collectList.stream().forEach(ele -> System.out.println(ele));
//		
//		
		//print the text of each link contains Amazon keyword
		
//		List<String> amazonLinkList = linksList.stream()
//					.filter(ele -> !ele.getText().equals("") && ele.getText().contains("Amazon"))
//					.map(ele -> ele.getText())
//					.collect(Collectors.toList());
		
		
		//List<String> amazonLinkList = linksList.stream()
			//	.filter(ele -> !ele.getText().isEmpty())
			//	.filter(ele -> ele.getText().contains("Amazon"))
			//	.map(ele -> ele.getText())
			//	.collect(Collectors.toList());
					
		//amazonLinkList.stream().forEach(ele -> System.out.println(ele));
		
		
	}

}