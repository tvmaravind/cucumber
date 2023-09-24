package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features/test.feature",
		glue = {"stepDefinition"}
		
		)


public class TestRunner {

}
