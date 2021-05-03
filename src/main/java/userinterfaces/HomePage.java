package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static Target MENSAJE_VALIDACION = Target.the("Mensaje My Account").
            located(By.xpath("//div[@id='content']/h2"));
}
