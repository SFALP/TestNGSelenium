package Clarusway.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Day05_230104_C02_ITestListener.class)
public class Day05_230104_C03_UseListener {
    @Test
    public void passedTest() {
        System.out.println("passed test");
    }

    @Test
    public void failedTest() {
        System.out.println("failed test");
        Assert.fail();
    }

    @Test(timeOut = 500)
    public void timedOutTest() throws InterruptedException {

        System.out.println("timed Out test");
        Thread.sleep(600);
    }
}