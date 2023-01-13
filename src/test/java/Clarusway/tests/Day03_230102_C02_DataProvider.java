package Clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_230102_C02_DataProvider {
    //user name, email, password, number veri tiplerinde calisildiginda
    @Test(
            dataProvider = "getData"//bu kodla, veri saglayicimizin getData methodunda oldugu adreslenmis(eslestirilmis) oldu
    )
    public void test01(String username, String email, String pass, int num) {
//method parametresi olacak; data provider'dan alinan verilerin tipine gore ve alinmasi gereken veri adedince
// atama yapilmak zorundadir

        //Yapilan islemi ekranda gormek icin asagidaki kodlar yazildi, NŞA'da yazilmak zorunda degildir.
        System.out.println("username = " + username);
        System.out.println("email = " + email);
        System.out.println("pass = " + pass);
        System.out.println("num = " + num);
/*
OUTPUT:
username = Karl
email = karl@clw.com
pass = 123
num = 1

username = Drake
email = drake@clw.com
pass = abc
num = 2

username = Garry
email = garry@clw.com
pass = abc123
num = 3

username = Elly
email = elly@clw.com
pass = def123
num = 4

 */
    }

    @DataProvider//Bu bolum veri saglamak icin olusturulmaktadir.
// Data provider, bize ayni tip verileri sadece tek bir method yazarak bircok defa testi tekrar edebilme hizmeti sunar.
//OR: asagida 4 farkli kisi icin yukarida tanimlanan duruma gore ayni anda test yapilabilmektedir.
    public Object[][] getData() {
        Object data[][] = {
                {"Karl", "karl@clw.com", "123", 1},
                {"Drake", "drake@clw.com", "abc", 2},
                {"Garry", "garry@clw.com", "abc123", 3},
                {"Elly", "elly@clw.com", "def123", 4}
        };
        return data;
    }
}
