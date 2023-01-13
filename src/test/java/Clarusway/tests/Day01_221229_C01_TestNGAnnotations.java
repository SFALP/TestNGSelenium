package Clarusway.tests;

import org.testng.annotations.*;

public class Day01_221229_C01_TestNGAnnotations {

/* ANNOTATIONS CESITLERI(Calisma sirasina gore siralanmistir):

@Before/After Suite
@Before/After Test
@Before/After Class
@Before/After Method

@Test
 */

    @Test
    public void test01() {
        System.out.println("\t\t\t\tTest 01 calisiyor");
    }

    @Test
    public void test02() {
        System.out.println("\t\t\t\tTest 02 calisiyor");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite calisti");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite calisti");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("\\tBefore Test calisti");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("\\tAfter Test calisti");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("\t\tBefore class calisti");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("\t\tAfter class calisti");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method calisti");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method calisti");
    }
}