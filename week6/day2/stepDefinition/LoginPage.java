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
	
	@Given ("Enter the username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@Given("Enter the password as (.*)$")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@Given("Enter the username as {string} and Enter the password as {string}")
	public void enterCredentials(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
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
