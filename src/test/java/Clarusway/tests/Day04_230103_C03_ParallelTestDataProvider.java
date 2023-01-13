package Clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day04_230103_C03_ParallelTestDataProvider {
    @Test(dataProvider = "getData")
    public void test01(String name, String surname) {
        System.out.println(name + " " + surname+" "+Thread.currentThread().getId());
//Paralel test'te, dataProvider'da olan veriler yazdirilirken rastgele siralamayla ekrana yansir
    }

    @DataProvider(parallel = true)
    public Object[][] getData() {
        return new Object[][]{
                {"Yusuf", "Celik"},
                {"Can", "Efe"},
                {"Merve", "Aslan"}
        };
    }
}
