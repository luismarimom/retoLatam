package co.com.choucair.banitsmo.examen.tasks;

import co.com.choucair.banitsmo.examen.userinterface.HomePage;
import co.com.choucair.banitsmo.examen.userinterface.MisViajesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Busca implements Task {


    public static Performable CodigoDeReserva() {
        return Tasks.instrumented(Busca.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.LINK_MIS_VIAJES)
        );
        actor.attemptsTo(
                WaitUntil.the(MisViajesPage.LINK_DONDE_ENCUENTRAS, isEnabled()),
                Click.on(MisViajesPage.LINK_DONDE_ENCUENTRAS)
        );
    }
}
