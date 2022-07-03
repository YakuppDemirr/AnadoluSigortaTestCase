package com.anadolusigorta.studycase;

import com.anadolusigorta.studycase.base.BaseTest;
import com.anadolusigorta.studycase.core.PropertiesFile;
import com.anadolusigorta.studycase.utils.Utility;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.anadolusigorta.studycase.pages.HomePage.*;
import static com.anadolusigorta.studycase.pages.LoginPage.*;

public class AnadoluSigortaTestAutomation extends BaseTest {

    @BeforeMethod(description = "Ana sayfa git")
    public void openHomePage(){
        goToHomePage();
        Assert.assertTrue(Utility.getHomePageControl());
        log.info("*** Ana sayfa başarili bir sekilde acildi. ***");
    }

    @Test(description = "Giriş sayfası aç ve giriş işlemlerini yap")
    public void loginControl(){
        successLogin();
        Assert.assertEquals(Utility.getText(userNameText), PropertiesFile.userName);
        log.info("*** Hesaba basarili bir sekilde giris yapildi. ***");
    }
}
