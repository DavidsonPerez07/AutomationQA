package co.edu.udea.certificacion.automationExercise.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class Validate implements Question<String> {
    private final Target target;

    public Validate(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(target).getText();
        return msg;
    }

    public static Validate succesfulRegister(Target target) {
        return new Validate(target);
    }

    public static Validate registerWithExistingEmail(Target target) {
        return new Validate(target);
    }
}