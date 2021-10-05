package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonArama {
    public static void main(String[] args) {
        // amazon web sayfasina gidip
        // java icin arama yapin
        // ve bulunan sonuc sayisini yazdirin

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("java" + Keys.ENTER);

        // class="a-m-us a-aui_72554-c a-aui_accordion_a11y_role_354025-c a-aui_killswitch_csa_logger_372963-t1
        // a-aui_launch_cardui_a11y_fix_346896-t1 a-aui_launch_expander_ally_fix_354901-t1
        // a-aui_markup_disabled_link_btn_351411-t1 a-aui_pci_risk_banner_210084-c
        // a-aui_popover_trigger_add_role_350993-t1 a-aui_preload_261698-c a-aui_rel_noreferrer_noopener_309527-c
        // a-aui_template_weblab_cache_333406-c a-aui_tnr_v2_180836-c"

        WebElement sonucYazisi= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonucYazisi.getText());

        // webelementler obje oldugu icin direk yazdirilamazlar
        // webelemntin sahip oldugu yaziyi string olarak yazdirmak icin
        // getText() method u kullanilir
    }
}
