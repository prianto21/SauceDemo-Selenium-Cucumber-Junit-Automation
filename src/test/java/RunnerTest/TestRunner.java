package RunnerTest;

import org.junit.runner.RunWith;

@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = "src/test/resources/Features"
		,glue={"steps"}
		)

public class TestRunner {

}