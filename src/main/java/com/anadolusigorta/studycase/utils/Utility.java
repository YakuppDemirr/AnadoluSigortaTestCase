package com.anadolusigorta.studycase.utils;

import com.anadolusigorta.studycase.core.DriverManager;
import com.anadolusigorta.studycase.core.PropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.anadolusigorta.studycase.base.BaseTest.log;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Utility extends DriverManager {

    public static void scrollWindow() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    public static boolean getHomePageControl(){
        return driver.getCurrentUrl()
                .equals(PropertiesFile.homePage);
    }

    public static WebElement waitElementVisible(By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return webElement;
    }

    public static boolean checkElementExists(By element){
        boolean isExists = false;
        try
        {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            driver.findElement(element);
            isExists = true;
        }
        catch (Exception e)
        {
            log.info("Element " + element + " bulunamadı.");
            isExists = false;
        }
        return isExists;
    }

    public static boolean clickElement(By element){
        boolean isClick = false;
        try
        {
            waitElementVisible(element).click();
            isClick = true;
        }
        catch (Exception e)
        {
            log.info("Element " + element + " bulunamadı.");
            isClick = false;
        }
        return isClick;
    }

    public static boolean isElementVisible(By element){
        boolean isVisible = false;
        try
        {
            isVisible = waitElementVisible(element).isDisplayed();
        }
        catch (Exception e)
        {
            log.info("Element " + element + " bulunamadı.");
            isVisible = false;
        }
        return isVisible;
    }
    public static String getText(By element){
        try
        {
            isElementVisible(element);
            String text = driver.findElement(element).getText();
            return text;
        }
        catch (Exception e)
        {
            log.info("Element " + element + " bulunamadı.");
            return null;
        }
    }

    public static String getValue(By element){
        try
        {
            isElementVisible(element);
            String value = driver.findElement(element).getAttribute("value");
            return value;
        }
        catch (Exception e)
        {
            log.info("Element " + element + " bulunamadı.");
            return null;
        }
    }

    public static boolean sendKeysElement(By element, String value ){
        boolean isSendKeys = false;

        try
        {
            WebElement webElement = waitElementVisible(element);
            webElement.sendKeys(value);
            isSendKeys = true;
        }
        catch (Exception e)
        {
            log.info("Element " + element + " bulunamadı.");
            isSendKeys = false;
        }
        return isSendKeys;
    }

    //Saniye cinsinden bekleme
    public static void waitBySeconds ( int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
