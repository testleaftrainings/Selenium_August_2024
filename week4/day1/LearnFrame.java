package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	/*
	 * noSuchFrameException - When the frame index or frame id or WebElement is not present 
	 * **/
	
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//Transfer the driver control to frame
		driver.switchTo().frame(0);
		WebElement clickBtn = driver.findElement(By.id("Click"));
		clickBtn.click();
		//Transfer driver back to webPage --> defaultContent()
		driver.switchTo().defaultContent();
		
		//Locate the search filed and type as TestLeaf
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("TestLeaf");
		
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		System.out.println(elements.size());
		
		//To handle nested frame 
			//Locate the outerframe first
		
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		driver.switchTo().frame(outerFrame);
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Frame count inside the outer frame "+frameCount);
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("(//button[@id='Click'])[1]")).click();
//		driver.switchTo().parentFrame();
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).clear();
	}
	
}
