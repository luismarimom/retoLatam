package co.com.choucair.banitsmo.examen.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.latam.com/es_co/")
public class HomePage extends PageObject {
    public static final Target LINK_MIS_VIAJES = Target.the("Link para ir al menu mis viajes")
            .locatedBy("//nav//p[contains(text(), 'Mis viajes')]");
}
