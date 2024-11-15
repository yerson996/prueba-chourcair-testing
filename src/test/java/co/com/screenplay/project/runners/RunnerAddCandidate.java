package co.com.screenplay.project.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registercandidate.feature",
        glue = "co.com.screenplay.project.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        tags = "@AddCandidate"
)
public class RunnerAddCandidate {
}

