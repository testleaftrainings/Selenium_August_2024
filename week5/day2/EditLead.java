package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class EditLead extends ProjectSpecificMethods {

	@Test(dataProvider = "sendData")
	public void runEditLead(String phno, String cname) throws InterruptedException {
		
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
		
}
	
	@DataProvider
	public String[][] sendData() {
		
		String[][] data = new String[3][2];
		
		data[0][0] = "99";
		data[0][1] = "Qeagle";
		
		data[1][0] = "98";
		data[1][1] = "TestLeaf";
		
		data[2][0] = "97";
		data[2][1] = "Qeagle";
		return data;
	}
	
	
}






