package tasks;

import models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.LoginPage.*;

public class Ingresar implements Task {

    DatosUsuario datosUsuario;

    public Ingresar(DatosUsuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    public static Ingresar lasCredenciales(DatosUsuario datosUsuario) {
        return Tasks.instrumented(Ingresar.class, datosUsuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datosUsuario.getEmail()).into(INPUT_CORREO),
                Enter.theValue(datosUsuario.getClave()).into(INPUT_CLAVE),
                Click.on(BOTON_LOGIN));
    }
}
