package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//To get the current window address--> getWindowHandle
		String currentWindowAddress = driver.getWindowHandle();
		System.out.println(currentWindowAddress);
		
		//Window Address 1st --> B03C7B5130616F2AA59E949E1BD71DF4
		//Window Address 2nd --> 5463371EC6278E1AC7A8F3161C26D750
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//To get all the window address --> getWindowHandles()
		Set<String> windowHandles = driver.getWindowHandles();
		
		
		System.out.println(driver.getTitle());
		
		for (String window : windowHandles) {
			System.out.println(window);
		}
		//Convert set into list
		List<String> window = new ArrayList<String>(windowHandles);
		
		//Transfer the driver control to the dashboard window
		driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		driver.switchTo().window(window.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		window.clear();// Remove all the existing address
		window.addAll(windowHandles2);
		driver.switchTo().window(window.get(2));
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.quit();
		
		
	}
	
}
