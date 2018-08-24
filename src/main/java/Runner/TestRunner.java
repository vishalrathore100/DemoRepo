package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\WorkSpaceHSA\\cucmberBDDFramework\\src\\main\\java\\Features\\login.feature",
		glue = {"StepDefinition"},
		format = {"pretty"},
		dryRun = false,
		monochrome = true
		
		)
public class TestRunner {

}
