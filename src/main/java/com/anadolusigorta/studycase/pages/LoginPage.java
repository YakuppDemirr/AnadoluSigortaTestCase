package com.anadolusigorta.studycase.pages;

import com.anadolusigorta.studycase.core.PropertiesFile;
import com.anadolusigorta.studycase.utils.Utility;
import org.openqa.selenium.By;
import static com.anadolusigorta.studycase.base.BaseTest.log;

public class LoginPage {

    public static By emailField = By.id("email");
    public static By passwordField = By.id("passwd");
    public static By submitButton = By.id("SubmitLogin");
    public static By userNameText = By.cssSelector("a[title='View my customer account'] span");

    public static void login(String email, String password){
        Utility.clickElement(HomePage.signInButton);
        log.info("*** Giris sayfasi aciliyor. ***");
        log.info("*** Kullanici bilgileri giriliyor. ***");
        Utility.sendKeysElement(emailField, email);
        log.info("*** Email bilgisi giriliyor. ***");
        Utility.sendKeysElement(passwordField, password);
        log.info("*** Sifre bilgisi giriliyor. ***");
        Utility.clickElement(submitButton);
    }

    public static void successLogin(){
        login(PropertiesFile.email, PropertiesFile.password);
        log.info("*** Giris islemi yapiliyor. ***");
    }
}
