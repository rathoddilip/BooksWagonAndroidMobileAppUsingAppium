package com.appium.test;

import com.appium.base.BaseClass;
import com.appium.pages.Login;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void login_to_application() throws InterruptedException {

       Login login=new Login(driver);
        login.login_to_application();
        System.out.println("Successfully login to app ");
    }
}
