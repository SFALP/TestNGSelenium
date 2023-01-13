package Clarusway.tests;

import Clarusway.utilities.BaseCrossBrowserTest;
import org.testng.annotations.Test;

public class Day04_230103_C01_ParallelTest extends BaseCrossBrowserTest {
//Parallel test, birden fazla yapilmasi gereken testlerin ayni anda yapilmasi islemidir.
//SEQUENCE TEST
    @Test
    public void test01() {
        driver.get("https://www.google.com/");
    }

    @Test
    public void test02() {
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void test03() {
        driver.get("https://www.trendyol.com/");
    }

}
