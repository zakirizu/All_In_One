package CucumberzRunnerFiles;

import org.junit.runner.RunWith;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/CucumberFeaturesFiles",
		glue = "CucumberStepDefinitionFiles",
		tags = "@DataTableDemo1"
		)

public class RunnerJUnit {

}
