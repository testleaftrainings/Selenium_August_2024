package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumListExample {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		//iterate the list
		//enchanced for loop which is for each
		
		// syntax (dataType localVariable : collectionVariableName){}
		for (WebElement webElement : elements) {
			System.out.println(webElement.getText());
		}
		
		
		
	}
	
	
}
