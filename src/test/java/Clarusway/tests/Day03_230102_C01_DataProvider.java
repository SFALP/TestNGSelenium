package Clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_230102_C01_DataProvider {

    @Test(dataProvider = "dataProvider")
    //Syntax:  @DataProvider(name = "myTestData")
    public void test01(String name) {
//verileri datProvider methodundan alarak calisacak olan test
        System.out.println(name);
    }


    @DataProvider
    public Object[][] dataProvider() {
        //verileri teste saglayacak olan method
        Object data[][] = {
                {"Karl"},
                {"Ortis"},
                {"Clarusway"},
        };

        return data;
    }


}
