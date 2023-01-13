package Clarusway.tests;

import Clarusway.utilities.BaseCrossBrowserTest;
import Clarusway.utilities.JSUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/*TASK
Go to URL: https://www.amazon.com/
Scroll in to view Amazon Ignite WebElement.
Scroll up search area WebElement.
Then flashing the background color.

 */
public class Day06_230105_C02_JSUtil extends BaseCrossBrowserTest {

    @Test
    public void test() throws InterruptedException {
        JSUtils.driver = driver;

        driver.get("https://www.amazon.com/");

        JSUtils.scrollIntoViewJS(driver.findElement(By.partialLinkText("Amazon Ignite")));

        // Debug amacli
        Thread.sleep(4000);

        JSUtils.scrollAllUpByJS();

        Thread.sleep(4000);

        JSUtils.flash(driver.findElement(By.id("twotabsearchtextbox")));

        Thread.sleep(4000);

    }

}
