package features;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions,monochrome=true", tags="@SmokeTest and @RegressionTest", 
plugin = {"pretty", "html : target/cucumber.html", "json:target/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests{
	
	
}

// not @RegressionTest, @SmokeTest and @RegressionTest, @SmokeTest or @RegressionTest