package com.anadolusigorta.studycase.core;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

    public static String email;
    public static String password;
    public static String homePage;
    public static String browser;
    public static String userName;
    public static int defaultTimeout;

    public static Properties getProperties(){
        Properties prop = new Properties();

        try {
            InputStream inputStream = new FileInputStream(".properties");
            prop.load(inputStream);
            return prop;
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getCause());
            exception.printStackTrace();
        }
        return null;
    }

    public static void readProperties(){
        Properties prob = PropertiesFile.getProperties();
        email = prob.getProperty("email");
        password = prob.getProperty("password");
        homePage = prob.getProperty("homePage");
        userName = prob.getProperty("userName");
        browser = prob.getProperty("browser");
        defaultTimeout = Integer.parseInt((prob.getProperty("defaultTimeout")));
    }
}
