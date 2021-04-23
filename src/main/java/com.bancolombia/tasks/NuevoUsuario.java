package com.bancolombia.tasks;

import com.bancolombia.userinterfaces.Principal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class NuevoUsuario implements Task {





    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(Principal.BUTTONADDUSER));
    }

    public static NuevoUsuario nuevoUsuario()
    {
        return Tasks.instrumented(NuevoUsuario.class);
    }
}
