package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsLoginWithXpath {

	public static void main(String[] args) {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//To load the url
		driver.get("http://leaftaps.com/opentaps");
		// Locate the username field
		//To store as local variable --> ctrl + 2 and release both keys and press L(lowercase)
		WebElement usernameFiled = driver.findElement(By.xpath("//input[@name='USERNAME']"));
		//To enter value of the usernameFiled --> WebElement.sendKeys();
		usernameFiled.sendKeys("demosalesmanager");
		
		//Locate the password field and enter the password as crmsfa
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		//Locate the login button and click on the login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//Locate the CRM/SFA link and click
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	}

}
