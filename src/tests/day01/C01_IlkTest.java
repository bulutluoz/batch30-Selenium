package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println("suandaki url : "+driver.getCurrentUrl());
        System.out.println("su anki baslik : "+ driver.getTitle());
        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.navigate().to("https://www.techproeducation.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);


        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        // driver.quit(); quit acik olan tum browser'lari kapatirken close sadece 1 browser kapatir


        driver.close();






    }
}
