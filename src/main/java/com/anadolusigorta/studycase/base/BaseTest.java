package com.anadolusigorta.studycase.base;

import com.anadolusigorta.studycase.core.DriverManager;
import com.anadolusigorta.studycase.core.PropertiesFile;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.*;

public class BaseTest extends DriverManager {

    public static Logger log = Logger.getLogger("AnadoluSigorta-ui");

    @Parameters({"browser"})
    @BeforeTest()
    public void initialize(@Optional String browser){
        PropertyConfigurator.configure("log4j.properties");
        log.info("Initializing.");
        PropertiesFile.readProperties();
        log.info("Properties file read.");
        DriverManager.setUpDriver(PropertiesFile.browser);
    }

    @AfterTest
    public void cleanUp(){
        log.info("Browser closed.");
        DriverManager.quitDriver();
    }
}
