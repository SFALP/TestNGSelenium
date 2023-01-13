package Clarusway.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day01_221229_C03_DependsOn {
    //homePage testimiz, login testimize bagli olacagindan (mantiken) dependsOnMethods attribute'unu kullaniyoruz
//Bagimli olunan test fail olursa bagimli olan method ignore edilir.
// Bagimli olan method alfabetik execution a bakilmaksizin bagimli olunan metoddan sonra calisir
// Coklu dependsOn kullaniminda tum bagimli olunan methodlar pass oldugu durumda bagimli method calisir

    @Test
    public void loginTest() {
        System.out.println("Login testi yapiliyor");
//        Assert.fail();
    }

    @Test
    public void registrationTest() {
        System.out.println("Registration testi yapiliyor");

    }

    @Test(dependsOnMethods = {"loginTest", "registrationTest"})
    public void homePageTest() {
        System.out.println("HomePage testi yapiliyor");
        //Bu method, loginTest'e bagimli olarak islem gorecektir.
    }
}