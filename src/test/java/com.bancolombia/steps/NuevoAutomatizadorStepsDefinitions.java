package com.bancolombia.steps;

import com.bancolombia.tasks.LLenarInfo;
import com.bancolombia.tasks.NuevoUsuario;
import com.bancolombia.userinterfaces.Principal;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class NuevoAutomatizadorStepsDefinitions

{
    @Before
    public void setup()
    {
        setTheStage(new OnlineCast());
    }
    @Given("^usuario puede acceder a la Url$")
    public void usuarioPuedeAccederALaUrl()
    {
        theActorCalled("usuario").attemptsTo(Open.browserOn(new Principal()));
        theActorInTheSpotlight().attemptsTo(NuevoUsuario.nuevoUsuario());
    }


    @When("^desee agregar un nuevo automatizador$")
    public void deseeAgregarUnNuevoAutomatizador(DataTable infoUser) {
        theActorInTheSpotlight().attemptsTo(LLenarInfo.enformulario(infoUser));
    }

    @Then("^valida que el nuevo resgistro se haya realizado$")
    public void validaQueElNuevoResgistroSeHayaRealizado() {

    }


}
