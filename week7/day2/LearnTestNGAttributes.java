package week7.day2;

import org.testng.annotations.Test;

public class LearnTestNGAttributes {
/**
 * priority - default value is zero
 * It execute the lowest priorty value first, 
 * if multiple testcase has same priority it execute based on ASCII value order
 * */
	
	
	/**
	 * enabled - default value is true,
	 * If value is assigned as false , The testcase will be ignored
	 * */
	
	
	@Test(priority = -1, enabled = false)
	public void runLogin() {
		System.out.println("Execute the login Testcase");
	}
	
	/**
	 * invocationCount - default value is 1,
	 * It execute the same testcase multiple time based on the invocationCount
	 * @throws InterruptedException 
	 * */
	
	/**
	 * invocationTimeOut - default value is zero,
	 * It works depends with invocationCount attribute
	 * To set the entire timeOut for invocationCount
	 * */
	
	
	/**
	 * threadPoolSize - default value is 1
	 * Used for parallel execution(invocationCount)
	 * */
	@Test(enabled = false,invocationCount = 5, invocationTimeOut = 4000, threadPoolSize = 3)
	public void runLead() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Execute the Lead Testcase");
	}
	
	
	@Test(priority = 1,dependsOnMethods = {"week7.day2.LearnDependsOnMethods.runLogin"})
	public void runOpportunity() {
		System.out.println("Execute the opportunity Testcase");
	}
	
	
	
}
