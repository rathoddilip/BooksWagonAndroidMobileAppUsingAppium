package com.appium.pages;

import com.appium.base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Login extends BaseClass {

    @FindBy(id = "com.bookswagon:id/etEmail")
    MobileElement email;
    @FindBy(id = "com.bookswagon:id/etPassword")
    MobileElement password;
    @FindBy(id = "com.bookswagon:id/loginbypassword")
    MobileElement loginButton;

    public Login(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void login_to_application() throws InterruptedException {
        Thread.sleep(4000);
        email.sendKeys("diliprathodtest@gmail.com");
        password.sendKeys("Login@123");
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

}
