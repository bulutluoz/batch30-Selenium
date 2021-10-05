package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev2_TekrarTesti{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // 2. Youtube web sayfasına gidin

        driver.get("https://www.youtube.com");

        // Ve sayfa başlığının “youtube” olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        String expectedTitle = "youtube";

        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {

            System.out.println("Test PASSED");

        }

        else {

            System.out.println("actualTitle = " + actualTitle);

        }

        // 3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.

        String expectedUrl = "youtube";

        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {

            System.out.println("Test PASSED");

        }

        else  {

            System.out.println("actualUrl = " + actualUrl);

        }

        // 4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/

        driver.navigate().to("https://www.amazon.com");

        // 5. Youtube sayfasina geri donun

        driver.navigate().back();

        // 6. (Refresh) Sayfayi yenileyin

        driver.navigate().refresh();

        // 7. Amazon sayfasina donun

        driver.navigate().forward();

        // 8. Sayfayi tamsayfa yapin

        driver.manage().window().maximize();

        // 9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.

        String expectedTitle2 = "Amazon";

        String actualTitle2 = driver.getTitle();

        if (actualTitle2.contains(expectedTitle2)) {

            System.out.println("Test PASSED");

        }

        else {

            System.out.println("actualTitle = " + actualTitle2);

        }

        // 10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın

        String expectedUrl2 = "https://www.amazon.com/";

        String actualUrl2 = driver.getCurrentUrl();

        if (actualUrl2.equals(expectedUrl2)) {

            System.out.println("Test PASSED");

        }

        else {

            System.out.println("actualUrl = " + actualUrl2);

        }

        // 11. Sayfayi kapatin

        driver.close();

    }

}
