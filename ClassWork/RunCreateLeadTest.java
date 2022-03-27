package CucumberRunner;

import io.cucumber.testng.CucumberOptions;
import stepDefinition.BaseClass;

@CucumberOptions(features = "src/main/java/CucumberFirst", 
				 glue = "stepDefinition", 
				 monochrome = true,
				 tags = "@Smoke and @Regression")
public class RunCreateLeadTest extends BaseClass {

}
