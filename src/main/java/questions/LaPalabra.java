package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.HomePage.MENSAJE_VALIDACION;

public class LaPalabra implements Question<String> {

    public static LaPalabra myAccount () {
        return new LaPalabra();
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MENSAJE_VALIDACION).viewedBy(actor).asString();
    }
}
