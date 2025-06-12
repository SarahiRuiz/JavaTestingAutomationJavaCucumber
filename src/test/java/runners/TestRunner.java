package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features",//where to find scenarios
    glue = {"stepsDefinitions", "Utility" },//steps to follow
    plugin = {"pretty", "html:target/cucumber-report.html", "json:cucumber.json"},//To generate the report with results
    monochrome = true
)
public class TestRunner {
}
