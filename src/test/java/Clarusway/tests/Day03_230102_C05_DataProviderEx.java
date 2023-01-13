package Clarusway.tests;

import Clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*TASK
Open the site: https://www.amazon.com/
Do it with DataProvider for
Java
JavaScript
Phyton
 */
public class Day03_230102_C05_DataProviderEx extends BaseTest {

    @Test(dataProvider = "getData")
    public void amazonSearchTest(String key) {
        driver.get("https://www.amazon.com/");//siteye gidildi.

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));//arama butonu bulundu

        searchBox.sendKeys(key + Keys.ENTER);
        //arama bolumune veri saglayicidan(dataProvider) gelen veri yadirildi ve enter'a basildi
        WebElement searchResult = driver.findElement(By.className("a-color-state"));//aramas onucunun yazdigi bolum bulundu

        Assert.assertTrue(searchResult.getText().contains(key));
        //arama sonucu bolumunde aranan ifadenin olup olmadigi verify edildi.
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {"Java"},
                {"Javascript"},
                {"Phyton"}
        };
    }
}