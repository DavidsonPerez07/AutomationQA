package co.edu.udea.certificacion.automationExercise.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationExerciseCartPage extends PageObject {
    public static final Target PROCEED_TO_CHECKOUT_BUTTON = Target.the("Proceed To Checkout Button").locatedBy("//*[@id='do_action']/div[1]/div/div/a");
}
