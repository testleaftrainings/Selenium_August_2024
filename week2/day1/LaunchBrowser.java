package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();// To open a chrome
		EdgeDriver ed = new EdgeDriver();// To open a Edge
		driver.get("http://leaftaps.com/opentaps");// to load the url
		Thread.sleep(5000);
		driver.close();// to close the browser window.
		//To maximize
		ed.manage().window().maximize();
		FirefoxDriver fd = new FirefoxDriver();
	}

}
