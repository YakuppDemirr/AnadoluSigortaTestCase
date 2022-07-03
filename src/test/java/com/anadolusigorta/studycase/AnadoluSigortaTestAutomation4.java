package com.anadolusigorta.studycase;

import com.anadolusigorta.studycase.base.BaseTest;
import com.anadolusigorta.studycase.utils.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.anadolusigorta.studycase.pages.CheckBasketPage.*;
import static com.anadolusigorta.studycase.pages.ProductDetailPage.*;

public class AnadoluSigortaTestAutomation4 extends BaseTest {

    @Test(description = "Sepetim sayfasını aç ve gerekli kontrolleri yap")
    public void goToCheckoutPage(){
        checkBasket();
        Assert.assertTrue(Utility.isElementVisible(checkoutPageControl));
        log.info("*** Sepetim sayfasi basarili bir sekilde acildi. ***");
        Assert.assertEquals(getTotalProductsValue,getTotalProductsInBasketValue );
        log.info("*** Urün detay ve sepetteki total products degerleri karsilastirildi. ***");
        Assert.assertEquals(getQuantityValue,getQuantityInBasketsValue );
        log.info("*** Urün detay ve sepetteki quantity degerleri karsilastirildi. ***");
        Assert.assertEquals(getTotalPriceValue,getTotalPriceInBasketValue );
        log.info("*** Urün detay ve sepetteki total price degerleri karsilastirildi. ***");
    }
}
