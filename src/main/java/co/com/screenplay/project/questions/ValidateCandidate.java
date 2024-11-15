package co.com.screenplay.project.questions;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static co.com.screenplay.project.ui.AddCandidateUI.STATUS;

@AllArgsConstructor
@Slf4j
public class ValidateCandidate implements Question<Boolean> {

    private String valorEsperado;

    @Override
    @Subject("Capturar el texto del elemento para posterior validacion")
    public Boolean answeredBy(Actor actor) {
        // Captura el texto del elemento
        String validCandidateApplication = STATUS.resolveFor(actor).getText();

        // Registra el texto capturado
        log.info("Texto capturado: {}", validCandidateApplication);

        // Verifica si el texto capturado es igual al valor esperado
        if (valorEsperado.equals(validCandidateApplication)) {
            log.info("El estado del candidato es el esperado: {}", valorEsperado);
            return true;
        } else {
            log.warn("El estado del candidato no es el esperado. Estado actual: {}", validCandidateApplication);
            return false;
        }
    }
    // Método para instanciar la clase con parámetros
    public static ValidateCandidate withParams(String valorEsperado) {
        return new ValidateCandidate(valorEsperado);
    }
}