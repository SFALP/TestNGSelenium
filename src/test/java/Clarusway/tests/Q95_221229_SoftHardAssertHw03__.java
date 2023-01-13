package Clarusway.tests;
/*
Test Case3: Negative Password Test
Open page https://practicetestautomation.com/practice-test-login/
Type username student into Username field.
Type password incorrectPassword into Password field.
Puch Submit button.
Verify error message is displayed.
Verify error message text is Your password is invalid!
 */
public class Q95_221229_SoftHardAssertHw03__ {
}
/*F4774-Emine Disceken COZUMU
 @Test
    public void test() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
​
        WebElement username = driver.findElement(By.xpath("(//div/input)[1]"));
        username.sendKeys("student");
​
        WebElement password = driver.findElement(By.xpath("(//div/input)[2]"));
        password.sendKeys("incorrectPassword");
​
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
​
        WebElement error = driver.findElement(By.xpath("//div[text()='Your password is invalid!']"));
        Assert.assertTrue(error.isDisplayed());
        Assert.assertEquals(error.getText(),"Your password is invalid!");
    }

 */