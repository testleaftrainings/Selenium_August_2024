package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSD extends ProjectSpecificMethod{
	
	//ChromeDriver driver;
	
	
	
	/*
	 * @Given("Set the test environment") public void sett() { driver = new
	 * ChromeDriver(); driver.get("http://leaftaps.com/opentaps/");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); }
	 * 
	 * @Given ("Enter the username as demosalesmanager") public void username() {
	 * driver.findElement(By.id("username")).sendKeys("demosalesmanager"); }
	 * 
	 * @Given("Enter the password as crmsfa") public void password() {
	 * driver.findElement(By.id("password")).sendKeys("crmsfa"); }
	 * 
	 * @When("Click on the login button") public void loginBtn() {
	 * driver.findElement(By.className("decorativeSubmit")).click(); }
	 * 
	 * @Then("Verify the login is successfull") public void verify() {
	 * System.out.println(driver.getTitle()); }
	 */
	@When("Click on the crmsfa link")
	public void clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@When("Click on leads tab")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@When("Click on the create lead link")
	public void clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
		}
	
	// object cucumber expression is (.*)$
	@Given("Enter the company name as (.*)$")
	public void enterCname(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	
	
	@Given("Enter the first name as (.*)$")
	public void enterfname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	
	@Given("Enter the last name as (.*)$")
	public void enterLname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	
	@When("Click on the create lead button")
	public void clickCreateLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	
	@Then("Verify the lead is create successfull")
	public void verifyLeadCreated() {
		String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(leadId);
	}
	
	
	
}
