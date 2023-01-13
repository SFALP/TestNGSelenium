package Clarusway.tests;

import Clarusway.utilities.BaseTestReport;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Day05_230104_C01_HtmlReports extends BaseTestReport {
    @Test
    public void testPass(ITestContext context){
        extentTest=extentReports.createTest("testPass");
        System.out.println("Test01 started at "+context.getStartDate());
        driver.get("https://www.google.com/");
//        Assert.fail();

    }
    @Test
    public void testFail(){
        extentTest=extentReports.createTest("testFail");
        System.out.println("Test02 started at ");
        driver.get("https://www.google.com/");
        Assert.fail();
    }
}
