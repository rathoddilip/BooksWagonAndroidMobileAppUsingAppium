package com.appium.pages;

import com.appium.base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Home extends BaseClass {

    @FindBy(className = "android.widget.LinearLayout")
    MobileElement searchBook;
    @FindBy(id = "com.bookswagon:id/edt_search")
    MobileElement searchInputBook;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")
    MobileElement searchBookButton;
    @FindBy(id = "com.bookswagon:id/relate")
    List<MobileElement> selectBook;
    @FindBy(id = "com.bookswagon:id/tv_addtocart")
    MobileElement addToCart;
    @FindBy(id = "com.bookswagon:id/rv_cart")
    MobileElement addToCartBasket;
    @FindBy(id = "com.bookswagon:id/lv_wishlist")
    MobileElement addToWishlist;
    @FindBy(id = "com.bookswagon:id/btn_paynow")
    MobileElement placeOrder;


    public Home(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void search_book() throws InterruptedException {
        Thread.sleep(2000);
        searchBook.click();
        Thread.sleep(2000);
        searchInputBook.sendKeys("Java");
        Thread.sleep(2000);
        searchBookButton.click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
    }

    public void select_particular_book() throws InterruptedException {
        Thread.sleep(2000);
        selectBook.get(1).click();
        Thread.sleep(2000);

    }
}
