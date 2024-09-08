package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:erail.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement fromField = driver.findElement(By.id("txtStationFrom"));
		fromField.clear();
		fromField.sendKeys("MAS"+Keys.ENTER);
		WebElement toField = driver.findElement(By.id("txtStationTo"));
		toField.clear();
		toField.sendKeys("MDU"+Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
//		//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr[2]/td[2]
		//Get the row count
		int rowCount = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr")).size();
		Set<String> trainNames = new LinkedHashSet<String>();
		List<String> duplicateTrainName = new ArrayList<String>();
		for (int i = 2; i <=rowCount; i++) {
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			if(!trainNames.add(text)) {
				duplicateTrainName.add(text);
			}
		}
		System.out.println(trainNames);
		System.out.println(duplicateTrainName);
		driver.close();
	}
	
	
	
}
