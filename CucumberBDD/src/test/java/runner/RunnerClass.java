package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\QSPR\\eclipse-workspace\\CucumberBDD\\src\\test\\java\\featureFile\\Login.feature"},
		glue= {"stepDefinition"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:reports\\login.html"}
		)

public class RunnerClass extends AbstractTestNGCucumberTests
{
	
}
