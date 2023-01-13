package Clarusway.tests;

import Clarusway.utilities.BaseCrossBrowserTest;
import Clarusway.utilities.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


/*TASK
Go to URL: http://crossbrowsertesting.github.io/login-form.html
Login with credentials by using ExcelUtils
Username: tester@crossbrowsertesting.com
Password: test123

 */
public class Day06_230105_C01_ExcelUtil extends BaseCrossBrowserTest {


    @Test
    public void test01() {

        String path = System.getProperty("user.dir") + "C:\\Users\\sevba\\IdeaProjects\\CWTestNGSelenium\\src\\test\\java\\Clarusway\\resources";

        ExcelUtils eu = new ExcelUtils(path, 2);

        driver.get("http://crossbrowsertesting.github.io/login-form.html");

        String email = eu.getCellData(1, 0);//email adresi alinmis oldu
        String password = eu.getCellData(1, 1);//Password degeri alindi.

        driver.findElement(By.id("username")).sendKeys(email);//sitede ilgili alana degerler yazdirildi
        driver.findElement(By.id("password")).sendKeys(password);//sitede ilgili alana degerler yazdirildi
        driver.findElement(By.id("submit")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement welcome = driver.findElement(By.xpath("//h2[contains(.,'Welcome')]"));
        wait.until(ExpectedConditions.visibilityOf(welcome));

        Assert.assertTrue(welcome.getText().contains(email));


    }
}

