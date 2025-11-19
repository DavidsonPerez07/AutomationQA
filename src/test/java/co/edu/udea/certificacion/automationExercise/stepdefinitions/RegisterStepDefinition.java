package co.edu.udea.certificacion.automationExercise.stepdefinitions;

import co.edu.udea.certificacion.automationExercise.questions.Validate;
import co.edu.udea.certificacion.automationExercise.tasks.*;
import co.edu.udea.certificacion.automationExercise.utils.WaitTime;
import co.edu.udea.certificacion.automationExercise.userinterfaces.AutomationExercisePage;
import static co.edu.udea.certificacion.automationExercise.userinterfaces.AutomationExercisePage.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class RegisterStepDefinition {

    public final Actor user = Actor.named("Davidson");

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(theDriver));
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Davidson");
    }

    @Given("I am in the main Automation Exercise main page")
    public void iAmInTheMainAutomationExerciseMainPage() {
        user.attemptsTo(OpenThe.navigator(new AutomationExercisePage()));
    }

    @When("I click on the Sing up Login button")
    public void iClickOnTheSingUpLoginButton() {
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(SING_UP_LOGIN_BUTTON));
    }

    @When("I fill out the New User Sing up fields with a not registered email")
    public void iFillOutTheNewUserSingUpFieldsWithANotRegisteredEmail() {
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("Davidson Perez", SING_UP_NAME_TEXT_BOX));
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("joseloantonio@gmail.com", SING_UP_EMAIL_TEXT_BOX));
    }

    @When("I fill out the New User Sing up fields with a registered email")
    public void iFillOutTheNewUserSingUpFieldsWithARegisteredEmail() {
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("Davidson Perez", SING_UP_NAME_TEXT_BOX));
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("davidsonperez@gmail.com", SING_UP_EMAIL_TEXT_BOX));
    }

    @When("I click on the Sing up button")
    public void iClickOnTheSingUpButton() {
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(SING_UP_BUTTON));
    }

    @When("I complete the rest of the sing up fields")
    public void iCompleteTheRestOfTheSingUpFields() {
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(SING_UP_MR_GENDER));
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("Davidson123", SING_UP_PASSWORD));
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(SelectThe.option("18", SING_UP_DAYS));
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(SelectThe.option("June", SING_UP_MONTHS));
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(SelectThe.option("2001", SING_UP_YEARS));
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(SING_UP_NEWSLETTER));
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("Davidson", SING_UP_FIRST_NAME));
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("Perez", SING_UP_LAST_NAME));
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("UdeA", SING_UP_COMPANY));
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("Street 19 #12-13", SING_UP_ADDRESS1));
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(SelectThe.option("United States", SING_UP_COUNTRY));
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("Ohio", SING_UP_STATE));
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("Columbus", SING_UP_CITY));
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("12345", SING_UP_ZIP_CODE));
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("1233214554", SING_UP_MOBILE_NUMBER));
    }

    @When("I click on the Create Account Button")
    public void iClickOnTheCreateAccountButton() {
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(SING_UP_CREATE_ACCOUNT_BUTTON));
    }

    @Then("I can see a message that says {string}")
    public void iCanSeeAMessageThatSays(String string) {
        if (string.contains("ACCOUNT")) {
            GivenWhenThen.then(user).should(GivenWhenThen.seeThat(Validate.succesfulRegister(SING_UP_CREATED_MESSAGE), Matchers.containsString(string)));
        } else {
            GivenWhenThen.then(user).should(GivenWhenThen.seeThat(Validate.succesfulRegister(SING_UP_EMAIL_EXIST_MESSAGE), Matchers.containsString(string)));
        }
    }
}
