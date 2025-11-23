package co.edu.udea.certificacion.automationExercise.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationExercisePaymentPage extends PageObject {
    public static final Target NAME_ON_CARD_TEXT_BOX = Target.the("Name On Card Text Box").located(By.name("name_on_card"));
    public static final Target CARD_NUMBER_TEXT_BOX = Target.the("Card Number Text Box").located(By.name("card-number"));
    public static final Target CVC_TEXT_BOX = Target.the("CVC Text Box").located(By.name("cvc"));
    public static final Target EXPIRY_MONTH_TEXT_BOX = Target.the("Expiry Month Text Box").located(By.name("expiry_ month"));
    public static final Target EXPIRY_YEAR_TEXT_BOX = Target.the("Expiry Year Text Box").located(By.name("expiry-year"));
    public static final Target PAY_AND_CONFIRM_ORDER = Target.the("Pay And Confirm Order").located(By.id("submit"));    
}
