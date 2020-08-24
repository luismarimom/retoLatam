package co.com.choucair.banitsmo.examen.questions;

import co.com.choucair.banitsmo.examen.userinterface.MisViajesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Valida implements Question<String> {

    public static Valida longitudCodigo() {
        return new Valida();
    }

    @Override
    public String answeredBy(Actor actor) {
        String texto = Text.of(MisViajesPage.SPAN_CODIGO_EJEMPLO).viewedBy(actor).resolve().replace(".", "").trim();
        return String.valueOf(texto.length());
    }
}
