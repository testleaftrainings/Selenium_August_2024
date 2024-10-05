package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {

	public static void main(String[] args) throws IOException {
		
		// Set the report path
		ExtentHtmlReporter report = new ExtentHtmlReporter("./report/result.html");
		
		//To maintain history of the report
		report.setAppendExisting(true);
		
		//Create an object for ExtentReports class
		ExtentReports extent = new ExtentReports();
		
		//Attach the report path to configure/create/generate report
		extent.attachReporter(report);
		
		
		//Create report for Testcase
		ExtentTest test = extent.createTest("TC_001_LoginTestCase", "Login TestCase with valid test data");
		test.assignAuthor("Gokul");
		test.assignCategory("Regression");
		
		
		test.pass("Username entered sucessfully");
		test.pass("Password entered sucessfully");
		test.pass("Login Successful", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/image1.png").build());
		
		
		ExtentTest test2 = extent.createTest("TC_002_LoginTC","Login with invalid test data");
		test2.assignAuthor("Babu");
		test2.assignCategory("smoke");
		ExtentTest node = test2.createNode("Login");
		node.pass("username entered successfully");
		node.pass("password entered successfully");
		node.fail("verify the login ", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/image1.png").build());
		
		//close the report / generate the report
		extent.flush();
		System.out.println("Report Generated");
		
		
		
	}
	
}
