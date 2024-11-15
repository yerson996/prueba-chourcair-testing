package co.com.screenplay.project.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class WaitFor implements Task {

    private final int seconds;

    public WaitFor(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static WaitFor seconds(int seconds) {
        return new WaitFor(seconds);
    }
}