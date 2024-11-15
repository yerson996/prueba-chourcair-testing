package co.com.screenplay.project.stepdefinition;


import co.com.screenplay.project.questions.ValidateCandidate;
import co.com.screenplay.project.tasks.AddCandidate;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static co.com.screenplay.project.utils.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterCandidate {



    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("Click agregar candidato")
    public void clickAddCandidate() {



        theActorCalled(ACTOR).attemptsTo(
                AddCandidate.registerCandidate("Juan", "Pablo", "Gomez", "prueba@prueba.com", "31421634", "Qa, Automatizacion", "b", "QA semi-senior" )
        );

    }

    @Then("Visualizara el formulario con estado hired")
    public void itWillDisplayTheForm() {
        theActorInTheSpotlight().should(seeThat(
                ValidateCandidate.withParams(VALORESPERADO))
        );
    }
}