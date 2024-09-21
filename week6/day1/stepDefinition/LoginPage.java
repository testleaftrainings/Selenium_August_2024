package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod{

//	ChromeDriver driver;
	
	@Given("Set the test environment")
	public void setEnvironment() {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Given ("Enter the username as demosalesmanager")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}
	
	@Given("Enter the password as crmsfa")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
	@When("Click on the login button")
	public void clickLoginBtn() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Verify the login is successfull")
	public void verifyLogin() {
		System.out.println(driver.getTitle());
	}
	
	@Given("Enter the username as demo")
	public void enterUser() {
		driver.findElement(By.id("username")).sendKeys("demo");
	}
	
}
