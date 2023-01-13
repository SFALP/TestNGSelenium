package Clarusway.tests;

import org.testng.annotations.Test;

public class Day01_221229_C04_Enabled {

    @Test(enabled = true)
    public void enabledTest(){

    }
    @Test(enabled = false)
    public void disabledTest(){
//enabled=false ifadesi eklenmisse o ilgili Test'in yaninda play(ucgen) ikon'u olusmayacak ve test'de calistirilamayacaktir.
        //Yani test disable=false ile erisime kapatilmis duruma alinir.
    }
}