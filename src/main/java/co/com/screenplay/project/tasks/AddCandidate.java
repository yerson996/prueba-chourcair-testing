package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.actions.Click;
import co.com.screenplay.project.utils.WaitFor;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import static co.com.screenplay.project.ui.AddCandidateUI.*;
import static co.com.screenplay.project.ui.HomeUI.BUTTON_RECRUITMENT;

@Slf4j
@AllArgsConstructor
public class AddCandidate implements Task {

    private String fullName;
    private String middleName;
    private String lastName;
    private String email;
    private String contactNumber;
    private String keywords;
    private String interviewer;
    private String interviewerTitle;

    @Override
    @Step("Rellenar formulario de candidato")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUTTON_RECRUITMENT),
                Click.on(ADDBUTTON),
                Enter.theValue(fullName).into(FIRSTNAMELABEL),
                Enter.theValue(middleName).into(MIDDLENAMELABEL),
                Enter.theValue(lastName).into(LASTNAMELABEL),
                Click.on(VACANCYSELECTINPUT),
                WaitFor.seconds(5),
                Click.on(LISTVACANCY),
                Enter.theValue(email).into(EMAILLABEL),
                Enter.theValue(contactNumber).into(CONTACTNUMBERLABERL),
                Enter.theValue(keywords).into(KEYWORDSLABEL),
                Click.on(CONSENTRADIOBUTTON),
                Click.on(CALENDARY),
                WaitFor.seconds(3),
                Click.on(OPCIONCALENDARYDAY),
                Click.on(SAVEBUTTON),
                WaitFor.seconds(5),
               Click.on(SHORTLISTBUTTON),
                WaitFor.seconds(5),
                Click.on(SAVEBUTTON),
                WaitFor.seconds(9),
                Click.on(SCHELUDEINTERVIEWBUTTON),
                WaitFor.seconds(8),
                Enter.theValue(interviewerTitle).into(INTERVIERTITLE),
                Enter.theValue(interviewer).into(INTERVIERLABEL),
                WaitFor.seconds(4),
                Click.on (LISTINTERVIEWER),
                WaitFor.seconds(2),
                Click.on(CALENDARYINTERVIEW),
                WaitFor.seconds(3),
                Click.on(CALENDARYINTERVIEWDAY),
                WaitFor.seconds(3),
                Click.on(SAVEBUTTON),
                WaitFor.seconds(5),
                Click.on(BUTTONMARKINTERVIEWPASSED),
                WaitFor.seconds(3),
                Click.on(SAVEBUTTON),
                WaitFor.seconds(5),
                Click.on(BUTTONOFFERJOB),
                WaitFor.seconds(4),
                Click.on(SAVEBUTTON),
                WaitFor.seconds(6),
                Click.on(BUTTONHIRE),
                WaitFor.seconds(6),
                Click.on(SAVEBUTTON),
                WaitFor.seconds(3),
                Click.on(BUTTON_RECRUITMENT),
                Click.on(VACANCYSELECTINPUTCANDIDATE),
                WaitFor.seconds(3),
                Click.on(LISTVACANCYCANDIDATE),
                WaitFor.seconds(2),
                Enter.theValue(fullName+ " ").into(CANDIDATENAMELABEL),
                WaitFor.seconds(4),
                Click.on(CANDIDATEFULLNAME),
                Click.on(STATUSCANDIDATE),
                WaitFor.seconds(4),
                Click.on(LISTSTATUSCANDIDATE),
                WaitFor.seconds(2),
                Enter.theValue(keywords).into(CANDIDATEKEYWORDSLABEL),
                WaitFor.seconds(2),
                Click.on(CALENDARYCANDIDATE),
                WaitFor.seconds(3),
                Click.on(OPCIONCALENDARYDAYCANDIDATE),
                WaitFor.seconds(6),
                Click.on(BUTTONSHEARCHCANDIDATE),
                WaitFor.seconds(7)

               /*
               // espera implicita
               WaitUntil.the(SHORTLISTBUTTON, isVisible()).forNoMoreThan(10).seconds(), // Esperar hasta que el botón esté visible
                Click.on(SHORTLISTBUTTON),
                WaitUntil.the(SAVEBUTTONSHORLISTBUTTON, isVisible()).forNoMoreThan(10).seconds(), // Esperar hasta que el botón esté visible
                Click.on(SAVEBUTTONSHORLISTBUTTON),
                WaitUntil.the(SCHELUDEINTERVIEWBUTTON, isVisible()).forNoMoreThan(10).seconds(), // Esperar hasta que el botón esté visible
                Click.on(SCHELUDEINTERVIEWBUTTON)*/
        );
    }

    public static AddCandidate registerCandidate(String fullName, String middleName, String lastName, String email, String contactNumber, String keywords, String interviewer, String interviewerTitle) {
        return Tasks.instrumented(AddCandidate.class, fullName, middleName,lastName, email, contactNumber, keywords, interviewer, interviewerTitle );
    }
}