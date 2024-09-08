package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		//To handle browser notification
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
//		driver.get("https://www.leafground.com/drag.xhtml");
		driver.get("https://www.myntra.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//Create object for Actions 
		Actions action = new Actions(driver);
		
		  WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		  
		  //To do mouseHover --> moveToElement(WebElement)
//		  action.moveToElement(men).perform();
		  
		  WebElement jackets = driver.findElement(By.xpath("//a[text()='Jackets']"));
//		  action.click(jackets).perform();
		  driver.executeScript("arguments[0].click();",jackets);
		  driver.executeScript("arguments[0].click();",jackets);
		  WebElement discountRange =
		  driver.findElement(By.xpath("//span[text()='Discount Range']"));
		  action.moveToElement(discountRange).perform(); WebElement nextBtn =
		  driver.findElement(By.xpath("//li[text()='Next']"));
		  action.moveToElement(nextBtn).click(nextBtn).perform();
		 
		
		
//		WebElement dragWE = driver.findElement(By.id("form:conpnl"));
//		action.dragAndDropBy(dragWE, 700, 0).pause(5000).dragAndDropBy(dragWE, -250, 0).perform();
//		
//		action.clickAndHold(dragWE).pause(2000).moveByOffset(150, 0).perform();
//		
		WebElement dragWE2 = driver.findElement(By.id("form:drag"));
		WebElement dropWE = driver.findElement(By.id("form:drop"));
		action.clickAndHold(dragWE2).moveByOffset(-150, 100).release().dragAndDrop(dragWE2, dropWE).perform();
		;
		
		WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
		
		action.click(searchField).sendKeys("TestLeaf").pause(5000)
			.keyDown(Keys.SHIFT).keyDown(Keys.HOME)
			.keyUp(Keys.HOME).keyUp(Keys.SHIFT).pause(3000)
			.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
	}
	
}
