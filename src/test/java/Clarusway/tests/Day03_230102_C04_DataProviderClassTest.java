package Clarusway.tests;

import org.testng.annotations.Test;

public class Day03_230102_C04_DataProviderClassTest {
    @Test(
            dataProvider = "testData",
            dataProviderClass = Day03_230102_C03_DataProviderClass.class
    )
    public void dataProviderTest(String deutsch, String turkisch) {
        System.out.println("deutsch = " + deutsch);
        System.out.println("turkisch = " + turkisch);
/*
deutsch = Ersten Test
turkisch = Ilk Test
deutsch = Zweiten Test
turkisch = Ikinci Test
deutsch = Dritten Test
turkisch = Ucuncu Test
 */
    }
}