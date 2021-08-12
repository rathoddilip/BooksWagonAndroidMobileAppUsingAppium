package com.appium.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setUp() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "emulatorDevice");
        cap.setCapability("deviceId", "emulator-5554");
        cap.setCapability( "platformName","Android");
        cap.setCapability("platformVersion", "9.0");
        cap.setCapability( "app","/home/arjun/Downloads/bookswagon.apk");
        cap.setCapability("appPackage", "com.bookswagon");
        cap.setCapability("appActivity", "com.bookswagon.splash.SplashActivity");

        try {
            URL url = new URL(" http://localhost:4723/wd/hub");
            driver = new AndroidDriver<>(url, cap);
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void tearDown() {
        driver.closeApp();
    }

}
