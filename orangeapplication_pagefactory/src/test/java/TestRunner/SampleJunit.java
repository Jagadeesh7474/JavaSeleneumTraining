package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature",
glue= {"StepDefinition"},
plugin= {"junit:target/Junitreport/report.xml"})

public class SampleJunit {

}
