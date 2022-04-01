package week6.day1.runner;

import io.cucumber.testng.CucumberOptions;
import week6.day1.stepdefn.W6D1HooksBaseClass;

@CucumberOptions(features = { "src/main/java/week6/day1/features"}, 	
				 glue = "week6/day1/stepdefn", 
				 monochrome = true,
				 publish = true,
				 tags = "@SmokeTest and @RegressionTest and @FunctionalTest"
				)
public class TestleafRunner extends W6D1HooksBaseClass{

}
