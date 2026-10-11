package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/Features/Login1OrangeHRM.feature",
                "src/test/resources/Features/Login3OrangeHRM.feature"},
        glue = "steps",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        }
)
public class FeatureRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object [][] scenarios(){return super.scenarios(); }
}















