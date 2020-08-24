package co.com.choucair.banitsmo.examen.tasks;

import co.com.choucair.banitsmo.examen.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Ingresa implements Task {

    public static Performable aLaPaginaLatam() {
        return Tasks.instrumented(Ingresa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new HomePage()));
    }
}
