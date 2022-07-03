package com.anadolusigorta.studycase.pages;

import com.anadolusigorta.studycase.utils.Utility;
import org.openqa.selenium.By;

import static com.anadolusigorta.studycase.utils.Utility.scrollWindow;
import static com.anadolusigorta.studycase.base.BaseTest.log;

public class ProductDetailPage {

    public static  String  getTotalProductsValue = null;
    public static  String  getQuantityValue = null;
    public static  String  getTotalPriceValue = null;

    public static By goToProduct = By.xpath("(//div[@class='product-container'])[5]");
    public static By productPlus = By.cssSelector("i[class='icon-plus']");
    public static By addToCart = By.cssSelector("button[name='Submit'] span");
    public static By goToBasketButton = By.cssSelector("a[title='Proceed to checkout'] span");
    public static By getTotalProducts = By.className("ajax_block_products_total");
    public static By getQuantity = By.id("layer_cart_product_quantity");
    public static By getTotalPrice = By.cssSelector("span[class='ajax_block_cart_total']");

    public static void goToProductDetailPage() {

        scrollWindow();
        Utility.clickElement(goToProduct);
        log.info("*** 5. ürün detayi aciliyor. ***");
        Utility.clickElement(productPlus);
        log.info("*** Urün adet sayisi bir artirildi. ***");
        Utility.clickElement(productPlus);
        log.info("*** Urün adet sayisi bir adet daha artirildi. ***");
        Utility.clickElement(addToCart);
        log.info("*** Urünler sepete ekleniyor. ***");
        getTotalProductsValue = Utility.getText(getTotalProducts);
        log.info("*** Total products degeri aliniyor. ***");
        getQuantityValue = Utility.getText(getQuantity);
        log.info("*** Total quantity degeri aliniyor. ***");
        getTotalPriceValue = Utility.getText(getTotalPrice);
        log.info("*** Total price degeri aliniyor. ***");
    }
}
