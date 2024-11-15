package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI extends PageObject {

    public static final Target INPUT_USER_NAME = Target.the("ingresa el nombre de usuario")
            .located(By.xpath("//input[@name='username']"));

    public static final Target INPUT_PASSWORD = Target.the("ingresa la contraseña")
            .located(By.xpath("//input[@name='password']"));

    public static final Target BUTTON_LOGIN = Target.the("pulsa el boton entrar")
            .located(By.xpath("//button[contains(.,'Login')]"));

}