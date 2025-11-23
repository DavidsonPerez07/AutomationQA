package co.edu.udea.certificacion.automationExercise.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationExerciseSingUpPage extends PageObject{
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
    public static final Target SING_UP_CREATE_ACCOUNT_BUTTON = Target.the("Sing Up Create Account Button").locatedBy("/html/body/section/div[1]/div/div/div/form/button");

    public static final Target SING_UP_CREATED_MESSAGE = Target.the("Sing Up Created Message").locatedBy("//*[@id='form']/div/div/div/h2/b");
    public static final Target SING_UP_CONTINUE = Target.the("Sing Up Continue").locatedBy("//*[@id='form']/div/div/div/div/a");
}
