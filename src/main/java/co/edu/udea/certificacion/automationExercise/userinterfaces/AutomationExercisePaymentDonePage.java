package co.edu.udea.certificacion.automationExercise.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationExercisePaymentDonePage extends PageObject {
    public static final Target ORDER_PLACED_MESSAGE = Target.the("Order Placed Message").locatedBy("//*[@id='form']/div/div/div/h2/b");
    public static final Target DOWNLOAD_INVOICE_BUTTON = Target.the("Download Invoice Button").locatedBy("//*[@id='form']/div/div/div/a");
}
