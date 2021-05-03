package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import models.DatosUsuario;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.LaPalabra;
import tasks.Ingresar;

import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.*;

public class PruebaLoginSteps {

    @Before
    public void preparacionAmbiente(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("usuario");
    }

    @Dado("que el usuaio se encuentra en la pagina opencart")
    public void queElUsuaioSeEncuentraEnLaPaginaOpencart() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://opencart.abstracta.us/index.php?route=account/login"));
    }

    @Cuando("ingresa sus credenciales")
    public void ingresaSusCredenciales(List <DatosUsuario>listaDatosUsuario) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.lasCredenciales(listaDatosUsuario.get(0)));
    }

    @Entonces("el visualizara la palabra (.*)")
    public void elVisualizaraLaPalabra(String texto) {
        OnStage.theActorInTheSpotlight().should(seeThat(LaPalabra.myAccount(),equalTo(texto)));

    }
}
