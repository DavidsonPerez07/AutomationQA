package co.edu.udea.certificacion.automationExercise.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationExerciseCheckoutPage extends PageObject{
    public static final Target CHECKOUT_COMMENT_TEXT_BOX = Target.the("Checkout Comment Text Box").locatedBy("//*[@id='ordermsg']/textarea");
    public static final Target PLACE_ORDER_BUTTON = Target.the("Place Order Button").locatedBy("//*[@id='cart_items']/div/div[7]/a");
    public static final Target TOTAL_AMOUNT = Target.the("Total Amount").locatedBy("//*[@id='cart_info']/table/tbody/tr[2]/td[4]/p");
}
