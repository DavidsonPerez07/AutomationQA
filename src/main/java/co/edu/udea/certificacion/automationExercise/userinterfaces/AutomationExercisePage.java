package co.edu.udea.certificacion.automationExercise.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationExercisePage extends PageObject {
    public static final Target SING_UP_LOGIN_BUTTON = Target.the("Sing Up Login Button").locatedBy("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a");

    public static final Target SING_UP_NAME_TEXT_BOX = Target.the("Sing Up Name Text Box").locatedBy("//*[@id='form']/div/div/div[3]/div/form/input[2]");
    public static final Target SING_UP_EMAIL_TEXT_BOX = Target.the("Sing Up Email Text Box").locatedBy("//*[@id='form']/div/div/div[3]/div/form/input[3]");
    public static final Target SING_UP_BUTTON = Target.the("Sing Up Button").locatedBy("//*[@id='form']/div/div/div[3]/div/form/button");

    public static final Target SING_UP_MR_GENDER = Target.the("Sing Up Mr Gender").located(By.id("id_gender1"));
    public static final Target SING_UP_MRS_GENDER = Target.the("Sing Up Mrs Gender").located(By.id("id_gender2"));
    public static final Target SING_UP_PASSWORD = Target.the("Sing Up Password").located(By.id("password"));
    public static final Target SING_UP_DAYS = Target.the("Sing Up Days").located(By.id("days"));
    public static final Target SING_UP_MONTHS = Target.the("Sing Up Months").located(By.id("months"));
    public static final Target SING_UP_YEARS = Target.the("Sing Up Years").located(By.id("years"));
    public static final Target SING_UP_NEWSLETTER= Target.the("Sing Up NewsLetter").located(By.id("newsletter"));
    public static final Target SING_UP_OPTIN = Target.the("Sing Up Optin").located(By.id("optin"));
    public static final Target SING_UP_FIRST_NAME = Target.the("Sing Up First Name").located(By.id("first_name"));
    public static final Target SING_UP_LAST_NAME = Target.the("Sing Up Last Name").located(By.id("last_name"));
    public static final Target SING_UP_COMPANY = Target.the("Sing Up Company").located(By.id("company"));
    public static final Target SING_UP_ADDRESS1 = Target.the("Sing Up Address1").located(By.id("address1"));
    public static final Target SING_UP_ADDRESS2 = Target.the("Sing Up Address2").located(By.id("address2"));
    public static final Target SING_UP_COUNTRY = Target.the("Sing Up Country").located(By.id("country"));
    public static final Target SING_UP_STATE = Target.the("Sing Up State").located(By.id("state"));
    public static final Target SING_UP_CITY = Target.the("Sing Up City").located(By.id("city"));
    public static final Target SING_UP_ZIP_CODE = Target.the("Sing Up Zip Code").located(By.id("zipcode"));
    public static final Target SING_UP_MOBILE_NUMBER = Target.the("Sing Up Mobile Number").located(By.id("mobile_number"));
    public static final Target SING_UP_CREATE_ACCOUNT_BUTTON = Target.the("Sing Up Create Account Button").locatedBy("//*[@id='form']/div/div/div/div/form/button");

    public static final Target SING_UP_CREATED_MESSAGE = Target.the("Sing Up Created Message").locatedBy("//*[@id='form']/div/div/div/h2/b");
    public static final Target SING_UP_CONTINUE = Target.the("Sing Up Continue").locatedBy("//*[@id='form']/div/div/div/div/a");

    public static final Target SING_UP_EMAIL_EXIST_MESSAGE = Target.the("Sing Up Email Exist Message").locatedBy("//*[@id='form']/div/div/div[3]/div/form/p");

    public static final Target LOGIN_EMAIL_TEXT_BOX = Target.the("Login Email Text Box").locatedBy("//*[@id='form']/div/div/div[1]/div/form/input[2]");
    public static final Target LOGIN_PASSWORD_TEXT_BOX = Target.the(("Login Password Text Box")).locatedBy("//*[@id='form']/div/div/div[1]/div/form/input[3]");
    public static final Target LOGIN_BUTTON = Target.the("Login Button").locatedBy("//*[@id='form']/div/div/div[1]/div/form/button");

    public static final Target VIEW_PRODUCT_BUTTON_FOR_PRODUCT1 = Target.the("View Product Button For Product 1").locatedBy("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a");

    public static final Target PRODUCT_QUANTITY_INPUT = Target.the("Product Quantity Input").located(By.id("quantity"));
    public static final Target ADD_TO_CART_BUTTON = Target.the("Add To Cart Button").locatedBy("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
    public static final Target VIEW_CART_MODAL_BUTTON = Target.the("View Cart Modal Button").locatedBy("//*[@id='cartModal']/div/div/div[2]/p[2]/a/u");

    public static final Target PROCEED_TO_CHECKOUT_BUTTON = Target.the("Proceed To Checkout Button").locatedBy("//*[@id='do_action']/div[1]/div/div/a");

    public static final Target CHECKOUT_COMMENT_TEXT_BOX = Target.the("Checkout Comment Text Box").locatedBy("//*[@id='ordermsg']/textarea");
    public static final Target PLACE_ORDER_BUTTON = Target.the("Place Order Button").locatedBy("//*[@id='cart_items']/div/div[7]/a");
    public static final Target PAY_AND_CONFIRM_ORDER = Target.the("Pay And Confirm Order").located(By.id("submit"));

}