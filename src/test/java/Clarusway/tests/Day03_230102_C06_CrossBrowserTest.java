package Clarusway.tests;

import Clarusway.utilities.BaseCrossBrowserTest;
import org.testng.Assert;
import org.testng.annotations.Test;
/* TASK
Birkac farkli browser ziyaret edilerek title dogrulamasi yapilmasi gerekmektedir.
 */

// Tum islemler;( Day03_230102_C06_CrossBrowser.xml ) isimli xml dosyasinda testler yaptirilmistir

public class Day03_230102_C06_CrossBrowserTest extends BaseCrossBrowserTest {
//Benzer veya ayni testin farkli browserlarla testlerinin yapilmasidir.

//browser bilgisi testng.xml dosyasindan alinacagindan dolayi kod asamasinda
// herhangi bir degisiklik goruntulenmeyecektir

    @Test
    public void crossBrowserTest() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Google");
    }

}