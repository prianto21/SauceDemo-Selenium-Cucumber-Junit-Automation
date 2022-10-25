package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//tests 
//tests2

//  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
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = {"steps"},plugin = {"pretty","html:target/cucumber-reports/report.html"})
public class TestRunner {

}


//@CucumberOptions(features="src/test/resources/Features",
//glue="steps",
//plugin = {
//		"pretty",
//		"html:target/cucumber-reports",
//		"json:target/cucumber-reports/Cucumber2021.json"
//}
//		)
//public class TestRunner extends AbstractTestNGCucumberTests{
//	
//}