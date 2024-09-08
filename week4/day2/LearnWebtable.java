package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String th2 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/thead/tr/th[6]")).getText();
		System.out.println(th2);
		
		//How to get the column count ?
		List<WebElement> allColumns = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/thead/tr/th"));
		
		for (WebElement element : allColumns) {
			System.out.println(element.getText());
		}
		System.out.println("--------------------");
		String thridRow2ndCol = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]/td[2]")).getText();
		System.out.println(thridRow2ndCol);
		

		//Get the row count
		int rowCount = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr")).size();
		System.out.println("Names are:");
		for (int i = 1; i <=rowCount; i++) {
			String name = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println(name);
		}
		
		System.out.println("-------------Name and join date");
		for (int i = 1; i <=rowCount; i++) {
			String name = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td[1]")).getText();
			String joinDate = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td[4]")).getText();
			System.out.println("Name: "+name+" and Join date: "+joinDate);
		}
		
		System.out.println("Data in the table ");
		//To print all the values 
		// iterate the row first
		for (int i =1; i <=rowCount; i++) {
			//iterate the column
			for (int j =1; j <=allColumns.size(); j++) {
				String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(text);
			}
		}
		
		driver.close();
		
	}
	

}
