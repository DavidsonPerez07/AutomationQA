package co.edu.udea.certificacion.automationExercise.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

public class SelectThe implements Task {
    private final String option;
    private final Target target;

    public SelectThe(String option, Target target) {
        this.option = option;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byVisibleText(option).from(target));
    }

    public static SelectThe option(String option, Target target) {
        return Tasks.instrumented(SelectThe.class, option, target);
    }
}
