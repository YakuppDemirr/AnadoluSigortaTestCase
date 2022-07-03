package com.anadolusigorta.studycase;

import com.anadolusigorta.studycase.base.BaseTest;
import com.anadolusigorta.studycase.utils.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.anadolusigorta.studycase.pages.TabWomenPage.openTabWomenPage;
import static com.anadolusigorta.studycase.pages.TabWomenPage.tabWomenPageControl;

public class AnadoluSigortaTestAutomation2 extends BaseTest {

    @Test(description = "Women tabını aç ve ilgili kontrolleri yap")
    public void openTabWomen(){
        openTabWomenPage();
        Assert.assertTrue(Utility.isElementVisible(tabWomenPageControl));
        log.info("*** Women tabi basarili bir sekilde acildi. ***");
    }
}
