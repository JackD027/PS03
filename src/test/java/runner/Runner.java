package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(		
	features = {".\\src\\test\\resources\\features\\Login.feature",".\\src\\test\\resources\\features\\Search.feature"},
	glue = {"stepDefinition"},
	dryRun = false,
	plugin = {"pretty",
			  "html:target/myreport.html",
			  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			  "timeline:test-output-thread/"
			  },
	publish = true,
	monochrome = true 
		)

public class Runner{

}
