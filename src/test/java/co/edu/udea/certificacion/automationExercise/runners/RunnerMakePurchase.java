package co.edu.udea.certificacion.automationExercise.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/make_a_purchase_on_the_platform.feature",
        glue = "co.edu.udea.certificacion.automationExercise.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerMakePurchase {}
