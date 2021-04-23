package com.bancolombia.tasks;

import com.bancolombia.userinterfaces.RegistroUsuario;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;
import org.seleniumhq.jetty9.util.thread.Scheduler;

import java.util.Map;

public class LLenarInfo implements Task {
   private static Map<String,String> informacion;

    public LLenarInfo(DataTable info)
    {
        informacion=info.asMap(String.class,String.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(SendKeys.of(informacion.get("primernombre")).into(RegistroUsuario.NOMBRE),SendKeys.of(informacion.get("apellido")).into(RegistroUsuario.APELLIDO),SendKeys.of(informacion.get("correo")).into(RegistroUsuario.CORREO));

        actor.attemptsTo(SelectFromOptions.byVisibleText(informacion.get("mes")).from(RegistroUsuario.MES));
        actor.attemptsTo(SelectFromOptions.byVisibleText(informacion.get("dia")).from(RegistroUsuario.DIA));
        actor.attemptsTo(SelectFromOptions.byVisibleText(informacion.get("anio")).from(RegistroUsuario.ANIO));
        actor.attemptsTo(SendKeys.of(informacion.get("lenguajes")).into(RegistroUsuario.LENGUAJES).thenHit(Keys.ENTER));
        actor.attemptsTo(Click.on(RegistroUsuario.BUTTONNEXTLOCATION));
        //Segunda pestana
        //actor.attemptsTo(Enter.theValue(informacion.get("ciudad")).into(RegistroUsuario.CIUDAD));
        actor.attemptsTo(Enter.theValue(informacion.get("ciudad")).into(RegistroUsuario.CIUDAD));
        actor.attemptsTo(Enter.theValue(informacion.get("codigoPostal")).into(RegistroUsuario.CODIGOPOSTAL));
        actor.attemptsTo(Click.on(RegistroUsuario.BUTTONNEXTDEVICES));
        //Tercera pestana
        actor.attemptsTo(Click.on(RegistroUsuario.XCOMPUTADOR));
        actor.attemptsTo(Click.on(RegistroUsuario.MCOMPUTADOR));
        actor.attemptsTo(Enter.theValue(informacion.get("computador")).into(RegistroUsuario.COMPUTADOR).thenHit(Keys.ENTER));
        actor.attemptsTo(Click.on(RegistroUsuario.EVERSION));
        actor.attemptsTo(Enter.theValue(informacion.get("version")).into(RegistroUsuario.VERSION).thenHit(Keys.ENTER));
        actor.attemptsTo(Click.on(RegistroUsuario.XLENGUAJE));
        actor.attemptsTo(Enter.theValue(informacion.get("lenguaje")).into(RegistroUsuario.LENGUAJE).thenHit(Keys.ENTER));
        actor.attemptsTo(Click.on(RegistroUsuario.BUTTONNEXTLASTSTEP));
        //Cuarta pestana
        actor.attemptsTo(Enter.theValue(informacion.get("contrasena")).into(RegistroUsuario.CONTRASENA).thenHit(Keys.ENTER));
        actor.attemptsTo(Enter.theValue(informacion.get("contrasenaConfirmacion")).into(RegistroUsuario.CONFIRMACIONCONTRASENA).thenHit(Keys.ENTER));
        actor.attemptsTo(Click.on(RegistroUsuario.ACEPTTERMS));
        actor.attemptsTo(Click.on(RegistroUsuario.ACEPTPOLITICAS));
        actor.attemptsTo(Click.on(RegistroUsuario.BUTTONCOMPLETESETUP));

    }
    public static LLenarInfo enformulario(DataTable infoUser)
    {
        return Tasks.instrumented(LLenarInfo.class,infoUser);
    }
}
