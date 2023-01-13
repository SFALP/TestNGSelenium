package Clarusway.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/*
Create tests that depend on each other
Create beforeClass and set up settings.
By creating interdependent tests;
First go to Facebook.
Then go to Google depending on Facebook,
Then go to Amazon depending on Google
Close the driver.
 */
public class Q98_221229_DependsOnHw {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void facebook() {
        driver.get("https://www.facebook.com/");
        System.out.println("Faceook");
    }

    @Test(dependsOnMethods = {"facebook"})
    public void google() {
        driver.get("https://www.google.com/");
        System.out.println("Google");
    }

    @Test(dependsOnMethods = {"google"})
    public void amazon() {
        driver.get("https://www.amazon.com/");
        System.out.println("Amazon");
    }
}