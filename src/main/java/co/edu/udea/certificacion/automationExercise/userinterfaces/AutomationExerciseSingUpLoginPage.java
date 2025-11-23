package co.edu.udea.certificacion.automationExercise.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationExerciseSingUpLoginPage extends PageObject{
    public static final Target SING_UP_NAME_TEXT_BOX = Target.the("Sing Up Name Text Box").locatedBy("//*[@id='form']/div/div/div[3]/div/form/input[2]");
    public static final Target SING_UP_EMAIL_TEXT_BOX = Target.the("Sing Up Email Text Box").locatedBy("//*[@id='form']/div/div/div[3]/div/form/input[3]");
    public static final Target SING_UP_BUTTON = Target.the("Sing Up Button").locatedBy("//*[@id='form']/div/div/div[3]/div/form/button");

    public static final Target SING_UP_EMAIL_EXIST_MESSAGE = Target.the("Sing Up Email Exist Message").locatedBy("//*[@id='form']/div/div/div[3]/div/form/p");

    public static final Target LOGIN_EMAIL_TEXT_BOX = Target.the("Login Email Text Box").locatedBy("//*[@id='form']/div/div/div[1]/div/form/input[2]");
    public static final Target LOGIN_PASSWORD_TEXT_BOX = Target.the(("Login Password Text Box")).locatedBy("//*[@id='form']/div/div/div[1]/div/form/input[3]");
    public static final Target LOGIN_BUTTON = Target.the("Login Button").locatedBy("//*[@id='form']/div/div/div[1]/div/form/button");
    public static final Target LOGIN_ERROR_MESSAGE = Target.the("Login Error Message").locatedBy("//*[@id='form']/div/div/div[1]/div/form/p");
}
