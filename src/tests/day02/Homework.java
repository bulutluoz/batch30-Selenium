package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

    public static void main(String[] args) throws InterruptedException {

        // 1. Bir class oluşturun : AmazonSearchTest

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

        // a.Amazon web sayfasına gidin. https://www.amazon.com/

        driver.get("https://www.amazon.com/");

        // b. Search(ara) “city bike”

        // Text Box
        // <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input
        // nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">

        // Search Button
        // <input id="nav-search-submit-button" type="submit" class="nav-input nav-progressive-attribute" value="Go" tabindex="0">

        WebElement textBox = driver.findElement(By.id("twotabsearchtextbox"));

        textBox.sendKeys("city bike" + Keys.ENTER);

        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

        // Sonuc Sayisi
        // <span dir="auto">1-24 of 688 results for</span> ===> // Alinacak herhangi bir html tagi olmadigi icin xpath yolu kopyalandi

        WebElement results= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));

        System.out.println("Listelenen urunlerin sayisi = " + results.getText());

        // d. “Shopping” e tıklayın.

        driver.navigate().to("https://www.amazon.com/Shopping/b?ie=UTF8&node=9408875011");

        // id="nav-search-submit-button"

        WebElement shopping = driver.findElement(By.id("nav-search-submit-button"));

        shopping.click();

        // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        // class="s-image"

        WebElement clickPhoto = driver.findElement(By.className("s-image"));

        clickPhoto.click();

        // 3. Sayfayi kapatin

        Thread.sleep(2000);

        driver.quit();

    }

}