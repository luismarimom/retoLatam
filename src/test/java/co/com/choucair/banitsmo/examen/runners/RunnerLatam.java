package co.com.choucair.banitsmo.examen.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/retoLatam.feature"},
        glue = "co.com.choucair.banitsmo.examen.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerLatam {
}
