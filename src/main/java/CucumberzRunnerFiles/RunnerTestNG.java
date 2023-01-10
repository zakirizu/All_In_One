package CucumberzRunnerFiles;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions
(
features="src/main/java/CucumberFeaturesFiles",
glue="CucumberStepDefinitionFiles" ,
monochrome=true,
dryRun= false,
tags="@hcm",
plugin= {"pretty","html:cucumberReports/cucumber.html","json:cucumberReports/cucumber.json"}
)
public class RunnerTestNG extends AbstractTestNGCucumberTests {
}
