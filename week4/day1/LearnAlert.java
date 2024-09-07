package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
/*
 * If alert is not handle the exception is unHandledAlertException
 * If alert is not available but try to interact with alert the exception is noAlertPresentException
 * **/
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//Simple Alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//To handle the Alert 
		//Step 1 transfer the driver control to the alert box
		Alert alert = driver.switchTo().alert();
		String simpleAlertText = alert.getText();
		System.out.println("Simple alert "+simpleAlertText);
		alert.accept();
		
		//Confirmation Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		String confirmationAlertText = alert.getText();
		System.out.println("Confirmation Alert "+confirmationAlertText);
		alert.dismiss();
		
		//Prompt Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("Babu");
		String promptAlertText = alert.getText();
		System.out.println("Prompt Alert "+promptAlertText);
		alert.accept();
		
		//Sweet Alert
		//Click on Delete button (This will trigger sweet alert)
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		//Click on the yes button in the Sweet Alert 
		driver.findElement(By.name("j_idt88:j_idt108")).click();
		//Click on the Show button for simple
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
	}
	
	
}
