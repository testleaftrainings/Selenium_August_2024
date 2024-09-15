package week5.day2;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethods{

	//dataProvider value is name attribute value in DataProvider annotation
		//if name attribute is not wriiten than use methodName of the DataProvider annotation
	@Test(dataProvider ="fetchData" )
	public void runCreateLead(String cname, String fname, String lname, String phno) {
			
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		
}
	
	//Indices/index it starts from zero
	//It
	@DataProvider(name="fetchData", indices = {2})
	public String[][] sendData() {
		//Declare the 2D Array
		String[][] data = new String[3][4];
		data[0][0] ="TestLeaf";
		data[0][1] = "Gokul";
		data[0][2] = "Sekar";
		data[0][3] = "99";
		
		data[1][0] ="Qeagle";
		data[1][1] = "Babu";
		data[1][2] = "M";
		data[1][3] = "98";
		
		data[2][0] ="TestLeaf";
		data[2][1] = "Hari";
		data[2][2] = "R";
		data[2][3] = "97";
		
		return data;
		
	}
	
	
}






