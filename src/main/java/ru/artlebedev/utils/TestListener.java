package ru.artlebedev.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class TestListener implements ITestListener {
    public void onFinish(ITestContext context) {
        System.out.println("Test is finished");
    }
}
