package com.anadolusigorta.studycase.pages;

import com.anadolusigorta.studycase.utils.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.anadolusigorta.studycase.base.BaseTest.log;
import static com.anadolusigorta.studycase.utils.Utility.*;

public class TabWomenPage {

    public static By tabWomen = By.cssSelector("a[title='Women']");
    public static By tabWomenPageControl = By.cssSelector("span[class='navigation_page']");

    public static void openTabWomenPage(){
        clickElement(tabWomen);
        log.info("*** Women tabı açıldı");
        scrollWindow();
        controlSubCategory();
    }

    public static void controlSubCategory(){

        for (int i = 1; i <= 2; i++) {
            controlSubCategoryIsLoad(i, By.cssSelector("a[class='subcategory-name']:nth-child(" + 1 + ")"));
        }
    }

    public static void controlSubCategoryIsLoad(int index, By element){

        boolean loadSubcategory = false;

        loadSubcategory = Utility.checkElementExists(element);
        if (index == 1) {
            log.info("*** " + " Tops subcategory yüklendi." + " ***");
        }
        else if (index == 2) {
            log.info("*** " + " Dresess subcategory yüklendi." + " ***");
        }
        Assert.assertTrue(loadSubcategory);
    }
}
