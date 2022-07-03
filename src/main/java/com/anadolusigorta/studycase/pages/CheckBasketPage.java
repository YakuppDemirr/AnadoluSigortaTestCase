package com.anadolusigorta.studycase.pages;

import com.anadolusigorta.studycase.utils.Utility;
import org.openqa.selenium.By;

import static com.anadolusigorta.studycase.base.BaseTest.log;
import static com.anadolusigorta.studycase.pages.ProductDetailPage.*;
import static com.anadolusigorta.studycase.utils.Utility.scrollWindow;

public class CheckBasketPage {

    public static  String  getTotalProductsInBasketValue = null;
    public static  String  getQuantityInBasketsValue = null;
    public static  String  getTotalPriceInBasketValue = null;

    public static By getQuantityInBasket = By.cssSelector("[class='cart_quantity_input form-control grey']");
    public static By getTotalProductsInBasket = By.cssSelector("td[id=total_product]");
    public static By getTotalPriceInBasket = By.cssSelector("span[id=total_price]");
    public static By checkoutPageControl = By.cssSelector("span[class='navigation_page']");

    public static void checkBasket(){

        Utility.clickElement(goToBasketButton);
        scrollWindow();
        getQuantityInBasketsValue = Utility.getValue(getQuantityInBasket);
        log.info("*** Total quantity degeri aliniyor. ***");
        getTotalProductsInBasketValue = Utility.getText(getTotalProductsInBasket);
        log.info("*** Total products degeri aliniyor. ***");
        getTotalPriceInBasketValue = Utility.getText(getTotalPriceInBasket);
        log.info("*** Total price degeri aliniyor. ***");
    }
}
