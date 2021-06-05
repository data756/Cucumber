package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src\\main\\resources\\uber.feature" }, 
		glue = { "stepDefinitions" },
		monochrome = true,
		tags="@Regression",
		plugin = {"pretty", "html:target/cucumber"}
)


public class UberTest {

}
