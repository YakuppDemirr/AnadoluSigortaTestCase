package com.anadolusigorta.studycase;

import com.anadolusigorta.studycase.base.BaseTest;
import org.testng.annotations.Test;
import static com.anadolusigorta.studycase.pages.ProductDetailPage.goToProductDetailPage;

public class AnadoluSigortaTestAutomation3 extends BaseTest {

    @Test(description = "Ürün detay sayfasını aç ve 3 adet ürün sepete ekle")
    public void goToProductDetails(){
        goToProductDetailPage();
        log.info("*** Ürün detay sayfasi basarili bir sekilde acildi. ***");
    }
}
