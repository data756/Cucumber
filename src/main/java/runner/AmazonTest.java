package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "\\src\\test\\Feature\\" }, glue = { "step" },
		monochrome = true
)

public class AmazonTest {

}
