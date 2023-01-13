package Clarusway.tests;

import org.testng.annotations.Test;

/*
TestNG'de, test kodunun kendisini de yapılandırarak tek bir test yöntemini paralel olarak çalıştırma imkanımız olabilir.
• threadPoolSize: Oluşturmak ve testi paralel olarak çalıştırmak istediğimiz iş parçacığı sayısına denir.
• invocationCount: Bu yöntemi kaç kez çağırmak istediğimiz zaman kullanırız.
•timeOut: Bir test yürütmesinin alması gereken maksimum süre. Aşılırsa, test otomatik olarak başarısız olur.
 */
public class Day04_230103_C02_ParallelTestAttribute {

    @Test(
            threadPoolSize = 2,//Testlerin kac cekirdekte paralel olarak calisacagini belirler
            invocationCount = 7// Testimizin kac defa calistirilacagini belirler
    )
    public void test() {
        System.out.println("Current thread ID = " + Thread.currentThread().getId());
    }
}
