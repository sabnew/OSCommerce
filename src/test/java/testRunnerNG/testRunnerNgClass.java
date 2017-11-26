package testRunnerNG;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = {"feature/osCommerce"},
		glue = {"stepDef"}
		)


public class testRunnerNgClass extends AbstractTestNGCucumberTests{
	
}
