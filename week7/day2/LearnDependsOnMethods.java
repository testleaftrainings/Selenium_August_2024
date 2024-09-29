package week7.day2;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {

	@Test(priority = 2)
	public void runLogin() {
		System.out.println("Execute the Login TestCase");
		
	}
	
	@Test(priority = 3, dependsOnMethods = {"runLogin", "runEdit"}, alwaysRun=true)
	public void runDelete() {
		System.out.println("Execute the Delete TestCase");
	}
	
	@Test(priority = 4, dependsOnMethods = {"runLogin", "runCreate"})
	public void runEdit() {
		System.out.println("Execute the Edit TestCase");
		throw new RuntimeException();
	}
	
	@Test(priority = 5, dependsOnMethods = {"runLogin"})
	public void runCreate() {
		System.out.println("Execute the Create TestCase");
		
	}
	
	
}
