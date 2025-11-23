package co.edu.udea.certificacion.automationExercise.stepdefinitions;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import co.edu.udea.certificacion.automationExercise.questions.Validate;
import co.edu.udea.certificacion.automationExercise.tasks.ClickOn;
import co.edu.udea.certificacion.automationExercise.tasks.OpenThe;
import co.edu.udea.certificacion.automationExercise.tasks.WriteThe;
import co.edu.udea.certificacion.automationExercise.userinterfaces.AutomationExerciseMainPage;

import static co.edu.udea.certificacion.automationExercise.userinterfaces.AutomationExerciseMainPage.*;
import static co.edu.udea.certificacion.automationExercise.userinterfaces.AutomationExerciseSingUpLoginPage.*;
import static co.edu.udea.certificacion.automationExercise.userinterfaces.AutomationExerciseProductDetailsPage.*;
import static co.edu.udea.certificacion.automationExercise.userinterfaces.AutomationExerciseCheckoutPage.*;
import static co.edu.udea.certificacion.automationExercise.userinterfaces.AutomationExercisePaymentPage.*;
import static co.edu.udea.certificacion.automationExercise.userinterfaces.AutomationExercisePaymentDonePage.*;
import static co.edu.udea.certificacion.automationExercise.userinterfaces.AutomationExerciseCartPage.*;

import co.edu.udea.certificacion.automationExercise.utils.WaitTime;
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

public class MakePurchaseStepDefinition {
    public final Actor user = Actor.named("Davidson");

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver webDriver;

    @Before
    public void setup() {
        user.can(BrowseTheWeb.with(webDriver));
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Davidson");
    }

    @Given("I am in the main Automation Exercise page")
    public void iAmInTheMainAutomationExercisePage() {
        user.attemptsTo(OpenThe.navigator(new AutomationExerciseMainPage()));
    }

    @When("I log in")
    public void iLogIn() {
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(SING_UP_LOGIN_BUTTON));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("davidsonperez@gmail.com", LOGIN_EMAIL_TEXT_BOX));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("Davidson123", LOGIN_PASSWORD_TEXT_BOX));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(LOGIN_BUTTON));
    }

    @When("I go to login page")
    public void iGoToLoginPage() {
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(SING_UP_LOGIN_BUTTON));
    }

    @When("I put incorrect credentials")
    public void iPutIncorrectCredentials() {
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("noexiste@gmail.com", LOGIN_EMAIL_TEXT_BOX));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("noexiste123", LOGIN_PASSWORD_TEXT_BOX));
    }

    @When("I select the product")
    public void iSelectTheProduct() {
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(ClickOn.button(VIEW_PRODUCT_BUTTON_FOR_PRODUCT1));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("5", PRODUCT_QUANTITY_INPUT));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(ADD_TO_CART_BUTTON));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(VIEW_CART_MODAL_BUTTON));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(PROCEED_TO_CHECKOUT_BUTTON));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("Comentario", CHECKOUT_COMMENT_TEXT_BOX));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(PLACE_ORDER_BUTTON));
    }

    @Then("I proceed with payment")
    public void iProceedWithPayment() {
        WaitTime.putWaitTimeOf(4000);
        user.attemptsTo(WriteThe.text("Tarjeta", NAME_ON_CARD_TEXT_BOX));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("1234567890", CARD_NUMBER_TEXT_BOX));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("123", CVC_TEXT_BOX));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("11", EXPIRY_MONTH_TEXT_BOX));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(WriteThe.text("2030", EXPIRY_YEAR_TEXT_BOX));

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(PAY_AND_CONFIRM_ORDER));
    }

    @Then("I can download my invoice")
    public void iCanDownloadMyInvoice() {
        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(DOWNLOAD_INVOICE_BUTTON));
    }

    @Then("I can see a message that says {string}")
    public void iCanSeeAMessageThatSays(String string) {
        if (string.contains("ORDER")) {
            GivenWhenThen.then(user).should(GivenWhenThen.seeThat(Validate.orderPlaced(ORDER_PLACED_MESSAGE), Matchers.containsString(string)));
        } else {
            GivenWhenThen.then(user).should(GivenWhenThen.seeThat(Validate.loginWithIncorrectCredentials(LOGIN_ERROR_MESSAGE), Matchers.containsString(string)));
        }
    }
}
