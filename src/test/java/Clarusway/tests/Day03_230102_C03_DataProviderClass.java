package Clarusway.tests;

import org.testng.annotations.DataProvider;

public class Day03_230102_C03_DataProviderClass {
    @DataProvider(name = "testData")
    public Object[][] data() {
        Object returnData[][] = {
                {"Ersten Test", "Ilk Test"},
                {"Zweiten Test", "Ikinci Test"},
                {"Dritten Test", "Ucuncu Test"}
        };
        return returnData;
    }
}