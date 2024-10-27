package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\divya\\IdeaProjects\\Cucumber\\Features\\Login.feature"},
        glue = {"com.stepDefinitionLogin","myHooks"},
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:Test-Output"}
                )
public class Runner {
}
