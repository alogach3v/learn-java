package com.la1ive.learn;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {


    @BeforeTest(groups = {"unit", "api", "web"})
    public void beforeTest() {
        System.out.println("Before Test...");
    }

    @Test(groups = {"unit"})
    public void firstTest() {
        System.out.println("First test running...");
//        Assert.fail();
    }

    @Test(groups = {"unit"})
    public void secondTest() {
        System.out.println("Second test running...");
    }

    @Test(groups = {"api"})
    public void thirdTest() {
        System.out.println("Third test running...");
    }

    @AfterTest(groups = {"unit", "api", "web"})
    public void afterTest() {
        System.out.println("After Test...");
    }
}

