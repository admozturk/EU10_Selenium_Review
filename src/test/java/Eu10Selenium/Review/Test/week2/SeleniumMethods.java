package Eu10Selenium.Review.Test.week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(1000);

        driver.get("https://www.cydeo.com");
        Thread.sleep(1000);

        driver.navigate().back(); //google
        Thread.sleep(1000);

        driver.navigate().forward();// cydeo
        Thread.sleep(1000);

        driver.navigate().refresh(); // cydeo





    }
}
