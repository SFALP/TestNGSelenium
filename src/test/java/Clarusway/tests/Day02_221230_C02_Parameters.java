package Clarusway.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day02_221230_C02_Parameters {
    @Test
    @Parameters("isim")
    public void test01(String name) {
        System.out.println("Hallo " + name);
    }
}
