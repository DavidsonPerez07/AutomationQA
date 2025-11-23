package co.edu.udea.certificacion.automationExercise.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationExerciseMainPage extends PageObject {
    public static final Target SING_UP_LOGIN_BUTTON = Target.the("Sing Up Login Button").locatedBy("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a");

    public static final Target VIEW_PRODUCT_BUTTON_FOR_PRODUCT1 = Target.the("View Product Button For Product 1").locatedBy("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a");
}