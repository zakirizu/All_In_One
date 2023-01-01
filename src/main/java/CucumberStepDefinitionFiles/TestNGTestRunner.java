package CucumberStepDefinitionFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
features="src/main/java/CucumberFeaturesFiles",
glue="CucumberStepDefinitionFiles",
monochrome = true,
tags="tagDemo",
plugin= {"pretty","html:Resources/cucumber.html","json:target/cucumber.json"}
)

public class TestNGTestRunner {
	
	
	
	
	
	
	

}
