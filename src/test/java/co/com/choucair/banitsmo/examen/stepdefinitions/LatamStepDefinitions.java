package co.com.choucair.banitsmo.examen.stepdefinitions;

import co.com.choucair.banitsmo.examen.questions.Valida;
import co.com.choucair.banitsmo.examen.tasks.Busca;
import co.com.choucair.banitsmo.examen.tasks.Ingresa;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LatamStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que el usuario ingresa a la web de Latam")
    public void ingresaPaginaDeLatam() {
        OnStage.theActor("Luis").wasAbleTo(
                Ingresa.aLaPaginaLatam()
        );
    }

    @When("^busca el codigo de reserva de ejemplo")
    public void buscaCodigoDeReserva() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Busca.CodigoDeReserva()
        );
    }

    @Then("^valida que la longitud es (.*)$")
    public void validaQueLaLongitudEs(String longitud) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("la longitud del codigo", Valida.longitudCodigo(), equalTo(longitud))
        );
    }
}
