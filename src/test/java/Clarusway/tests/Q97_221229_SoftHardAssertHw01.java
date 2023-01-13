package Clarusway.tests;

import Clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
Test Case1: Positive Login Test
Open page https://practicetestautomation.com/practice-test-login/
Type username student into Username field
Type password Password123 into Password field
Puch Submit button.
Verify new page URL contains practicetestautomation.com/logged-in-successfully/
Verify new page contains expected text ('Congratulations' or 'successfully logged in')
Verify button Log out is displayed on the new page.

 */
public class Q97_221229_SoftHardAssertHw01 extends BaseTest {
    @Test
    public void loginTest() throws InterruptedException {

//Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

//Type username student into Username field
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student" + Keys.TAB);

//Type password Password123 into Password field
        driver.findElement(By.id("password")).sendKeys("Password123" + Keys.TAB);

//Puch Submit button.
        driver.findElement(By.id("submit")).click();

//Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        String currentUrl = driver.getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(currentUrl.contains("practicetestautomation.com/logged-in-successfully/"));

//Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        WebElement page = driver.findElement(By.tagName("html"));
        softAssert.assertTrue(page.getText().contains("successfully logged in") || page.getText().contains("Congratulations"));

//Verify button Log out is displayed on the new page.
        WebElement logout = driver.findElement(By.linkText("Log out"));
        logout.click();
        Thread.sleep(3000);
        softAssert.assertTrue(logout.isDisplayed(), "Log out görüntülenemiyor...");
        softAssert.assertAll();
    }
}