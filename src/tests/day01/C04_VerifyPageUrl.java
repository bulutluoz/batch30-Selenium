package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageUrl {
    public static void main(String[] args) {
        //Yeni bir class olusturalim : (VerifyURLTest)
        // techproeducation ana sayfasina gidelim https://www.techproeducation.com/

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        //Sayfa URL’inin www.techproeducation.com oldugunu dogrulayin

        String expectedUrl= "www.techproeducation.com";
        String actualUrl= driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test Failed");
            System.out.println(" Gecerli URL : " + actualUrl);
        }
        driver.close();
    }
}
