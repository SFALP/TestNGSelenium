package Clarusway.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReUsableMethods {
    //ekran goruntusu alinmasiyle ilgili method'dur
    public static String getScreenshot(WebDriver driver, String name) throws IOException {

//Screenshot dosya ismi icin suanki tarihi String olarak aliyoruz
        String date = formatCurrentDate("yyyyMMddhhmmss");

//Screenshot alinmasi komutu asagidaki gibidir:
        //Alinan screenshot, file objesi olacagi icin File'a atanir.
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

// Kaydedilecek dosyanin yolunu belirliyoruz.
        String target = System.getProperty("user.dir") + "\\test-output\\Screenshots\\" + name + date + ".png";

        File targetFile = new File(target);

//Kaynagi hedefe kopyaliyoruz.
        FileUtils.copyFile(source, targetFile);
        return target;
    }

    public static String formatCurrentDate(String pattern) {
        return new SimpleDateFormat(pattern).format(new Date());
    }
}
