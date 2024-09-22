package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.ProjectSpecificMethod;
//feature attribute to set the feature file location
	//glue attribute to set the test script package name
		//publish attribute helps to generate the report
			//monochrome attribute helps to remove junk characters in the console output
@CucumberOptions(features = {"src/test/java/features"},
				 glue = {"stepDefinition"},
				 publish =true,
				 monochrome = true,
				 tags = "not @Smoke")
public class CucumberRunner extends ProjectSpecificMethod{

}
