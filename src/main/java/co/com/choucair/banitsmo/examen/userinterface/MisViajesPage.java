package co.com.choucair.banitsmo.examen.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MisViajesPage {

    public static final Target LINK_DONDE_ENCUENTRAS = Target.the("link para ir a la informacion de donde encontrar el codigo")
            .locatedBy("#bookingSearchForm-c86__open-modal");
    public static final Target SPAN_CODIGO_EJEMPLO = Target.the("span que contiene el codigo de ejemplo")
            .locatedBy("//span[@class='record-locator']");
}
