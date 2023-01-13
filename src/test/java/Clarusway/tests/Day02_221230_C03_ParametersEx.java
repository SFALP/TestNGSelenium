package Clarusway.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day02_221230_C03_ParametersEx {
    String driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browserName) {
//Driver konfigurasyonlari yapiliyor.
        if (browserName.equals("chrome")) {
            driver = "chrome";
            //chrome confg yapildi
        } else if (browserName.equals("firefox")) {
            driver = "firefox";
            //firefox confg yapildi
        } else if (browserName.equals("opera")) {
            driver = "opera";
            //opera confg yapildi
        }
    }

    @AfterMethod
    public void tearDown() {
        driver = "-";
//driver kapatiliyor
        System.out.println("Driver sonlandirildi");

    }

    @Test
    public void test01() {
//testimiz gerceklesiyor
        System.out.println("Driver objesi olusturuldu - " + driver);
        System.out.println("Test execution basladi");
        System.out.println("Testte kullanilan driver = " + driver);
    }
}
