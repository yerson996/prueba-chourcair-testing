package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddCandidateUI extends PageObject {

    public static final Target ADDBUTTON= Target.the("boton ADD")
            .located(By.xpath ("//button[@type='button'][contains(.,'Add')]"));

      public static final Target FIRSTNAMELABEL= Target.the("Label Primer nombre")
            .located(By.xpath ("//input[@name='firstName']"));

    public static final Target MIDDLENAMELABEL= Target.the("Label de segundo nombre")
            .located(By.xpath("//input[@name='middleName']"));

    public static final Target LASTNAMELABEL= Target.the("Label del apellido")
            .located(By.xpath("//input[@name='lastName']"));

    public static final Target VACANCYSELECTINPUT= Target.the("Label para selecionar la lista de Vacancy")
            .located(By.xpath("//div[@class='oxd-select-text-input']"));

    //esta parte sirve para dar click a un item hijo de un hijo que no se le puede obtener en un selector
    public static final Target LISTVACANCY= Target.the("Lista de vacancy")
            .locatedBy(".oxd-select-dropdown > div:nth-child(3)");

    public static final Target EMAILLABEL= Target.the("Label del email")
            .located(By.xpath ("(//input[contains(@placeholder,'Type here')])[1]"));

    public static final Target CONTACTNUMBERLABERL= Target.the("Label del numero del contacto")
            .located(By.xpath ("(//input[contains(@placeholder,'Type here')])[2]"));

    public static final Target KEYWORDSLABEL= Target.the("Label de las palabras claves")
            .located(By.xpath ("//input[contains(@placeholder,'Enter comma seperated words...')]"));

    public static final Target CONSENTRADIOBUTTON= Target.the("Boton consent data")
            .located(By.xpath ("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));

    public static final Target CALENDARY= Target.the("Calendario")
            .located(By.xpath("//input[contains(@placeholder,'yyyy-dd-mm')]"));

    public static final Target OPCIONCALENDARYDAY= Target.the("Seleccionar la opcion today en el calendario")
            .located(By.xpath("(//div[contains(.,'Today')])[17]"));

    public static final Target SAVEBUTTON= Target.the("Boton del boton save")
            .located(By.xpath ("//button[@type='submit'][contains(.,'Save')]"));

    //Xpath Application Stage
    public static final Target SHORTLISTBUTTON = Target.the("Botón Shortlist")
            .located(By.xpath("//button[contains(.,'Shortlist')]"));

    //Xpath aplication stage 2
    public static final Target SCHELUDEINTERVIEWBUTTON = Target.the("Botón Schedule Interview")
            .located(By.xpath("//button[@type='button'][contains(.,'Schedule Interview')]"));

  //Xpath Schedule Interview
  public static final Target INTERVIERTITLE = Target.the("Label Interview Title")
          .located(By.xpath("(//input[contains(@class,'oxd-input oxd-input--active')])[6]"));

  public static final Target INTERVIERLABEL = Target.the("Label Interviewer")
          .located(By.xpath("//input[@include-employees='onlyCurrent']"));

    public static final Target LISTINTERVIEWER= Target.the("Lista de entrevistadores")
            .locatedBy(".oxd-autocomplete-dropdown > div:nth-child(1)");

    public static final Target CALENDARYINTERVIEW = Target.the("Icono del calendario")
            .located(By.xpath("//i[contains(@class,'oxd-icon bi-calendar oxd-date-input-icon')]"));

    public static final Target CALENDARYINTERVIEWDAY= Target.the("Boton de today del calendario")
            .located(By.xpath("(//div[contains(.,'Today')])[17]"));

    // Xpath Aplication stage 3
    public static final Target BUTTONMARKINTERVIEWPASSED= Target.the("Botón Mark Interview Passed'")
            .located(By.xpath("//button[contains(.,'Mark Interview Passed')]"));

    //Xpath Mark Interview Passed
    public static final Target BUTTONOFFERJOB= Target.the("Botón Offer job")
            .located(By.xpath("//button[contains(.,'Offer Job')]"));

    public static final Target BUTTONHIRE= Target.the("Botón Schedule Interview")
            .located(By.xpath("//button[contains(.,'Hire')]"));

    public static final Target VACANCYSELECTINPUTCANDIDATE= Target.the("Select input Vacancy")
            .located(By.xpath("(//div[@tabindex='0'])[2]"));

    public static final Target LISTVACANCYCANDIDATE= Target.the("Lista de las Vacancys")
            .locatedBy(".oxd-select-dropdown > div:nth-child(3)");

    public static final Target STATUSCANDIDATE= Target.the("Select input Status")
            .located(By.xpath("(//div[@tabindex='0'])[4]"));

    public static final Target LISTSTATUSCANDIDATE= Target.the("Lista de Status")
            .locatedBy(".oxd-select-dropdown > div:nth-child(10)");

    public static final Target CANDIDATENAMELABEL= Target.the("Label del Candidate Name")
            .located(By.xpath("//input[@placeholder='Type for hints...']"));

    public static final Target CANDIDATEFULLNAME= Target.the("Lista del Candidate Name")
            .locatedBy(".oxd-autocomplete-dropdown > div:nth-child(1)");

    public static final Target CANDIDATEKEYWORDSLABEL= Target.the("Label Keywords")
            .located(By.xpath("//input[@placeholder='Enter comma seperated words...']"));

    public static final Target CALENDARYCANDIDATE= Target.the("Select input Date of Application")
            .located(By.xpath("//input[@placeholder='From']"));

    public static final Target OPCIONCALENDARYDAYCANDIDATE= Target.the("Boton Today en el calendario")
            .located(By.xpath("//div[@class='oxd-date-input-link --today']"));

    public static final Target BUTTONSHEARCHCANDIDATE= Target.the("Boton Search ")
            .located(By.xpath("//button[contains(.,'Search')]"));

    public static final Target STATUS= Target.the("Label Status")
            .located(By.xpath("(//div[@role='cell'])[6]"));

}