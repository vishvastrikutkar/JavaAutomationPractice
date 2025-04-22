package StepDefinition.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue="StepDefinition",
        publish = true,
        plugin = { "pretty" }
)

public class RunCucumberTest {
}
