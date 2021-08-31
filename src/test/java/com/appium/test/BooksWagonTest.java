package com.appium.test;

import com.appium.base.BaseClass;
import com.appium.pages.Home;
import com.appium.pages.Login;
import com.appium.utility.CustomListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class BooksWagonTest extends BaseClass {

    @Test
    public void login_to_application() throws InterruptedException {

       Login login=new Login(driver);
        login.login_to_application();
        System.out.println("Successfully login to app ");
    }
    @Test
    public void search_book() throws InterruptedException {
        login_to_application();
        Home home=new Home(driver);
        home.search_book();
        home.select_particular_book();
    }
    @Test
    public void add_to_cart() throws InterruptedException {
        login_to_application();
        Home home=new Home(driver);
        home.search_book();
        home.select_particular_book();
        home.add_to_cart();
    }
    @Test
    public void add_to_wishlist_test() throws InterruptedException {
        login_to_application();
        Home home=new Home(driver);
        home.search_book();
        home.select_particular_book();
        home.add_to_wishlist();
    }
    @Test
    public void place_order_book() throws InterruptedException {
        login_to_application();
        Home home=new Home(driver);
        home.search_book();
        home.select_particular_book();
        home.add_to_cart();
        home.place_order();
    }
}
