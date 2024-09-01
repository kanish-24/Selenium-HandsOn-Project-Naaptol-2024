package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "/home/himanshu/Desktop/B38-SPR201-JAVA/CucumberTestNG-Construct-Week-Project-B38/src/test/resources/Naaptol_Jewellery&Watches-Module",
		
		glue = "stepDefinitions"
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
