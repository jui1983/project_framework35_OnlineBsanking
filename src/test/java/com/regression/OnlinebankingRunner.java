package com.regression;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"json:target/cucumber.json"},
		features= {"/Users/juibhuiyan/eclipse-workspace/Batch35/batch35_automation_framwork/src/test/resources/Online banking Login.feature"},
		glue= {"com.generic"},
		tags= "@Smoke"
		
		
	)
public class OnlinebankingRunner extends AbstractTestNGCucumberTests{

}
