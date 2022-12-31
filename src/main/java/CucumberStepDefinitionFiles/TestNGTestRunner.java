package CucumberStepDefinitionFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
features="src/main/java/CucumberFeaturesFiles",
glue="CucumberStepDefinitionFiles",
monochrome = true,
plugin= "{html:target/cucumber.html}"
)

public class TestNGTestRunner {
	
	
	
	
	
	
	

}
