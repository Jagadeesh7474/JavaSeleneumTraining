package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {
"src\\test\\resources\\Feature\\Sample1.feature",
},
glue= {"StepDefinition","TestRunner"}, 
plugin= {"pretty","html:target/cucumberreport/report.html"},
//tags= ("@sanity"),
monochrome=true)
public class SampletestNg extends AbstractTestNGCucumberTests{
	

}
