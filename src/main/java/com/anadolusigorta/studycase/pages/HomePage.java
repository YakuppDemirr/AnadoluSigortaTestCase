package com.anadolusigorta.studycase.pages;
import org.openqa.selenium.By;

import static com.anadolusigorta.studycase.base.BaseTest.log;
import static com.anadolusigorta.studycase.core.PropertiesFile.homePage;
import static com.anadolusigorta.studycase.core.DriverManager.driver;

public class HomePage {

    public static By signInButton = By.cssSelector("a[title='Log in to your customer account']");

    public static void goToHomePage(){

        driver.navigate().to(homePage);
        log.info("*** Ana sayfa aciliyor. ***");
    }
}
