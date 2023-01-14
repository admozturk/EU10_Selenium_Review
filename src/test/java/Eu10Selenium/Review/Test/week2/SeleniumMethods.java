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

        driver.navigate().to("https://www.ebay.com");

        System.out.println(driver.getTitle()); // returns string

        System.out.println(driver.getCurrentUrl()); // gets url of the page and returns String

        driver.navigate().to("https://www.abc.com");

        String actualTitle = driver.getTitle();
       if (actualTitle.equals("ABC Home Page - ABC.com")){
           System.out.println("Verification PASSED!");
       }else{
           System.out.println("Verification FAILED!!!");
       }

        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals("https://abc.com/")){
            System.out.println("Verification PASSED!");
        }else{
            System.out.println("Verification FAILED!!!");
        }
        driver.close();


    }
}
