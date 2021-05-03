package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static Target INPUT_CORREO = Target.the("campo direccion email").
            located(By.id("input-email"));

    public static Target INPUT_CLAVE = Target.the("campo clave").
            located(By.id("input-password"));

    public static Target BOTON_LOGIN = Target.the("boton para iniciar sesion").
            located(By.xpath("//input[@class='btn btn-primary']"));
}
