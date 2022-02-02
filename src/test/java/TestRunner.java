import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/scenarioOutline.feature",   // manually type for feature file location
        glue = "stepDef",// manually type make relation between features file with stepDef by glue
        dryRun = false,  // default-false, when true-it's help to run without browser opening/real runtime test to ensure every steps are implemented or not
        monochrome = true, // this provide clear console without any unreadable special character after test run
        tags = "@smoke",
        plugin = {                              // manually type for report
                "json:target/cucumber.json"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // extends AbstractTestNGCucumberTests for Automate
}
