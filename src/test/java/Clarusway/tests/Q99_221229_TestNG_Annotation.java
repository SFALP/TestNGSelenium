package Clarusway.tests;

import org.testng.annotations.*;

/*
Create a class.
Create 2 test methods.
Use TestNG annotations that can be used in the class.
Interpret output in console.

 */
public class Q99_221229_TestNG_Annotation {

    @Test
    public void test01() {
        System.out.println(">>>>>Test01 calisti");
    }

    @Test
    public void test02() {
        System.out.println(">>>>>Test02 calisti");
    }

    @BeforeSuite
    public void beforSuite() {
        System.out.println("Before Suite calisti");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite calisti");
    }

    @BeforeTest
    public void beforTest() {
        System.out.println(">>Before Test calisti");
    }

    @AfterTest
    public void afterTest() {
        System.out.println(">>After Test calisti");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println(">>>Before Class calisti");
    }

    @AfterClass
    public void afterClass() {
        System.out.println(">>>After Class calisti");
    }

    @BeforeMethod
    public void beforeMethods() {
        System.out.println(">>>>Before Methods calisti");
    }

    @AfterMethod
    public void afterMethods() {
        System.out.println(">>>>After Methods calisti");
    }
}