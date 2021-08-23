package com.appium.test;

import com.appium.base.BaseClass;
import com.appium.pages.Home;
import com.appium.pages.Login;
import org.testng.annotations.Test;

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
}