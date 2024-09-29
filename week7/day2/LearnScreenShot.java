package week7.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenShot {

	
	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 1: Take a snapShot/screenshot
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		//Step 2: Locate the file location to save the screenshot
		File screenshotLocation = new File("./snaps/image1.png");
		//Step 3: Save the screenshot
		FileUtils.copyFile(screenshot, screenshotLocation);
		
		WebElement loginForm = driver.findElement(By.id("form"));
		
		File src = loginForm.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/image2.jpeg");
		FileUtils.copyFile(src, desc);
		
	}
	
}
