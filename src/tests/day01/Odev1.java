package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // 2.ChromeDriver kullanarak, youtube  anasayfasina gidin

        driver.get("https://www.youtube.com");

        // Ve sayfa basliginin (title) “youtube” icerdigini dogrulayin (verify), degilse dogru basligi yazdirin.

        String expectedTitle = "youtube";

        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {

            System.out.println("Test PASSED");

        }

        else {
            System.out.println("Test FAILED");
            System.out.println("actualTitle = " + actualTitle);

        }

        // 3.Sayfa URL’sinin “youtube” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.

        String expectedUrlKelime = "url";

        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlKelime)) {

            System.out.println("Test PASS");

        }

        else {

            System.out.println("actualUrl = " + actualUrl);

        }

        // 4.https://www.walmart.com/ sayfasina gidin.

        driver.navigate().to("https://www.walmart.com");

        // 5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

        String expectedTitle2 = "Walmart.com";

        String actualTitle2 = driver.getTitle();

        if (actualTitle2.contains(expectedTitle2)) {

            System.out.println("Bu title Walmart.com iceriyor");

        }

        else {

            System.out.println("Bu title Walmart.com icermiyor = " + actualTitle2);

        }

        // 6. Tekrar youtube sayfasina donun

        driver.navigate().back();

        // 7. Sayfayi yenileyin

        driver.navigate().refresh();

        // 8. Sayfayi tam sayfa (maximize) yapin

        driver.manage().window().maximize();

        // 9.Browser’i kapatin

        driver.quit();

    }

}
