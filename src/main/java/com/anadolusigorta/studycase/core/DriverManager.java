package com.anadolusigorta.studycase.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.time.Duration;
import static com.anadolusigorta.studycase.base.BaseTest.log;

public class DriverManager {

    public static WebDriver driver = null;;

    public static void setUpDriver(String browserType){
        if(driver == null){
            switch (browserType){
                case "chrome":
                    log.info("Launching Chrome Browser");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    log.info("Launching Firefix Browser");
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    log.info("Launching IE Browser");
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                default:
                    break;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PropertiesFile.defaultTimeout));
        }
    }

    public static void quitDriver(){
        if (driver != null){
            driver.close();
            driver.quit();
            driver = null;
        }
    }
}
