package co.edu.udea.certificacion.automationExercise.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationExerciseProductDetailsPage extends PageObject {
    public static final Target PRODUCT_QUANTITY_INPUT = Target.the("Product Quantity Input").located(By.id("quantity"));
    public static final Target ADD_TO_CART_BUTTON = Target.the("Add To Cart Button").locatedBy("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
    public static final Target VIEW_CART_MODAL_BUTTON = Target.the("View Cart Modal Button").locatedBy("//*[@id='cartModal']/div/div/div[2]/p[2]/a/u");
}
