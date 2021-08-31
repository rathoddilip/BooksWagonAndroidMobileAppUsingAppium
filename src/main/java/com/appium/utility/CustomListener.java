package com.appium.utility;

import com.appium.base.BaseClass;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class CustomListener extends BaseClass implements ITestListener {
    ScreenshotTestImage screenshotTestImage = new ScreenshotTestImage();

    public CustomListener() {
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("SUCCESS Test");
        screenshotTestImage.success(result.getMethod().getMethodName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("FAILED Test");
        try {
            screenshotTestImage.failed(result.getMethod().getMethodName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
