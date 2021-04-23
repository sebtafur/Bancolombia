package com.bancolombia.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuario
{
    //PRIMER TAB
    public static Target NOMBRE = Target.the("Nombre").locatedBy("//*[@id=\"firstName\"]");
    public static Target APELLIDO = Target.the("Apellido").locatedBy("//*[@id=\"lastName\"]");
    public static Target CORREO = Target.the("Correo").locatedBy("//*[@id=\"email\"]");
    public static Target LENGUAJES = Target.the("Lenguajes").locatedBy("//*[@id=\"languages\"]/div[1]/input");
    public static Target DIA = Target.the("Dia").locatedBy("//*[@id=\"birthDay\"]");
    public static Target MES = Target.the("Mes").locatedBy("//*[@id=\"birthMonth\"]");
    public static Target ANIO = Target.the("Anio").locatedBy("//*[@id=\"birthYear\"]");
    public static Target BUTTONNEXTLOCATION = Target.the("location").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a");
    //SEGUNDO TAB
    public static Target CIUDAD = Target.the("Ciudad").locatedBy("//*[@id=\"city\"]");
    public static Target CODIGOPOSTAL = Target.the("CodigoPostal").locatedBy("//*[@id=\"zip\"]");
    public static Target PAIS = Target.the("Pais").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]");
    public static Target BUTTONNEXTDEVICES = Target.the("devices").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a");
    //TERCER TAB
    public static Target COMPUTADOR = Target.the("Computador").locatedBy("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]");
    public static Target XCOMPUTADOR = Target.the("XComputador").locatedBy("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/a/i");
    public static Target MCOMPUTADOR = Target.the("MComputador").locatedBy("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[1]");
    public static Target VERSION = Target.the("version").locatedBy("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]");
    public static Target EVERSION = Target.the("version").locatedBy("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span");
    public static Target LENGUAJE = Target.the("Lenguaje").locatedBy("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]");
    public static Target XLENGUAJE = Target.the("Lenguaje").locatedBy("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span");
    public static Target BUTTONNEXTLASTSTEP = Target.the("lastStep").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a");
    //CUARTO TAB
    public static Target CONTRASENA = Target.the("Contrasena").locatedBy("//*[@id=\"password\"]");
    public static Target CONFIRMACIONCONTRASENA = Target.the("ConfirmacionContrasena").locatedBy("//*[@id=\"confirmPassword\"]");
    public static Target DIVCIUDAD = Target.the("completeSetup").locatedBy("//span[text()='{0}']");
    public static Target ACEPTTERMS = Target.the("location").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]");
    public static Target ACEPTPOLITICAS = Target.the("location").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]");
    public static Target BUTTONCOMPLETESETUP = Target.the("completeSetup").locatedBy("//*[@id=\"laddaBtn\"]/span");

}
