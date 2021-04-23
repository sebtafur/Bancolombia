package com.bancolombia.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.bancolombia.steps",
        features = "src/test/com/bancolombia/resources/features/creacion_nuevo_automatizador.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)

public class NuevoAutomatizador {

}
