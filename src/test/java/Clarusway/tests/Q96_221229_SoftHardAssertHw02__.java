package Clarusway.tests;

import Clarusway.utilities.BaseTest;
import org.testng.annotations.Test;

/*
Test Case2: Negative Username Test
Open page https://practicetestautomation.com/practice-test-login/
Type username incorrectUser into Username field.
Type password Password123 into Password field.
Puch Submit button.
Verify error message is displayed.
Verify error message text is Your username is invalid!
 */
public class Q96_221229_SoftHardAssertHw02__ extends BaseTest {
    @Test
    public void test01(){
//Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

//Type username incorrectUser into Username field.
 //       WebElement username= driver.findElement();


//Type password Password123 into Password field.
//Puch Submit button.
//Verify error message is displayed.
//Verify error message text is Your username is invalid!
    }

}
/*F4774-Emine Disceken COZUMU
   @Test
    public void test() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
​
        WebElement username = driver.findElement(By.xpath("(//div/input)[1]"));
        username.sendKeys("incorrectUser");
​
        WebElement password = driver.findElement(By.xpath("(//div/input)[2]"));
        password.sendKeys("Password123");
​
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
​
        WebElement error = driver.findElement(By.xpath("//div[text()='Your username is invalid!']"));
        Assert.assertFalse(!error.isDisplayed());
        Assert.assertEquals(error.getText(),"Your username is invalid!");
    }

 */