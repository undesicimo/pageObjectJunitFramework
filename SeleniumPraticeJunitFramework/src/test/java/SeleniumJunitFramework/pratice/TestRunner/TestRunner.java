package SeleniumJunitFramework.pratice.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
    (
    features = "src/Features/Login.feature",
    glue = "SeleniumJunitFramework.pratice.StepDefinitions",
    plugin = {"pretty"},
    monochrome = true
    )
public class TestRunner {
    
}
