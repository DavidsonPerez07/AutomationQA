package co.edu.udea.certificacion.automationExercise.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register_on_the_platform.feature",
        glue = "co.edu.udea.certificacion.automationExercise.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerRegisterOnThePlatform {}