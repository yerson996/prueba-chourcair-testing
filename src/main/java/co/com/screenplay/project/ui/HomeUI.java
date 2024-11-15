package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI extends PageObject {

    public static final Target BUTTON_RECRUITMENT= Target.the("Boton Recruitmen")
            .located(By.xpath ("//span[contains(.,'Recruitment')]"));

}