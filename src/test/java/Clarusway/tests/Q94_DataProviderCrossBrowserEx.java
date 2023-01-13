package Clarusway.tests;

import Clarusway.utilities.BaseCrossBrowserTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/* TASK
Open the site http://opencart.abstracta.us/
Using the Search function do it with Data Provider for Mac, iPad and Samsung
    */
public class Q94_DataProviderCrossBrowserEx extends BaseCrossBrowserTest {
    @Test(dataProvider = "getData")
    public void test(String ara) throws InterruptedException {
        driver.get("http://opencart.abstracta.us/");
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='search']"));
        searchBox.sendKeys(ara + Keys.ENTER);
        Thread.sleep(2500);

        WebElement searchResult = driver.findElement(By.xpath("(//h1)[2]"));
        String sResult = searchResult.getText();
        Assert.assertTrue(sResult.contains(ara));

    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {"Mac"},
                {"iPad"},
                {"Samsung"}
        };
    }

}
/*XML Kodlariyla 2. browser ile de test edilmistir.

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="aaa Suite">
    <test name="Browser-Chrome">
        <parameter name="browser" value="Chrome"></parameter>
        <classes>
            <class name="Clarusway.tests.Q94_DataProviderCrossBrowserEx"></class>
        </classes>
    </test>
    <test name="Browser-Firefox">
        <parameter name="browser" value="Firefox"></parameter>
        <classes>
            <class name="Clarusway.tests.Q94_DataProviderCrossBrowserEx"></class>
        </classes>
    </test>
</suite>

 */