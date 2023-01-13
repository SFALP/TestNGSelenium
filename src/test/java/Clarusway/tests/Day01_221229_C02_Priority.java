package Clarusway.tests;

import org.testng.annotations.Test;

public class Day01_221229_C02_Priority {
    //TestNG(default) olarak @Test annotationlari alfabetik siraya gore (ascending) execute eder
    //TestNG priority'sinin sayi degeri en az olan testi ilk once calistirir.
    //Priority attribute'u icin negatif degerler de kullanilabilir.
// TestNG default priority 0'dir.

    @Test(priority = 1000)
    public void test02() {
        System.out.println("Test02 calisti");
    }

    @Test(priority = 1001)
    public void test04() {
        System.out.println("Test04 calisti");
    }

    @Test(priority = 1500)
    public void test01() {
        System.out.println("Test01 calisti");
    }

    @Test(priority = 2000)
    public void test03() {
        System.out.println("Test03 calisti");
    }

    @Test(priority = -1)
    public void test05() {
        System.out.println("Test05 calisti");
    }
    @Test
    public void test06() {
        System.out.println("Test06 calisti");
    }
}