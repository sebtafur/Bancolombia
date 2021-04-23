package com.bancolombia.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/")
public class Principal extends PageObject
{
     public static Target BUTTONADDUSER=Target.the("addUser").locatedBy("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a");
}
