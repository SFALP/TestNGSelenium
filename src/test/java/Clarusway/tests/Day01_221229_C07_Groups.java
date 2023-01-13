package Clarusway.tests;

import org.testng.annotations.Test;

public class Day01_221229_C07_Groups {
    //Bu groups attribute'u sayesinde istenilen gruplara sahip test case'lerine ozel olarak calistirilebilir.
    //Or1: group bolumlerinde smoke(smoke.xml) yazan testleri yeniden calistir
    //Or1: group bolumlerinde regression(regression.xml) yazan testleri yeniden calistir
//Boylelikle testlerin yonetimi kolaylastirilabilir

    @Test(groups = {"smoke", "regression"})
    public void loginTest() {

    }

    @Test(groups = {"regression"})
    public void aboutTest() {

    }

    @Test(groups = {"regression"})
    public void contactTest() {

    }

    @Test(groups = {"regression"})
    public void registrationTest() {

    }

    @Test(groups = {"regression", "smoke"})
    public void checkoutTest() {

    }
}