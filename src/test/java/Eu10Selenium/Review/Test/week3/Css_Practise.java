package Eu10Selenium.Review.Test.week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Practise {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement trial1 = driver.findElement(By.cssSelector("form#registrationForm"));

        driver.get("https://practice.cydeo.com/dropdown");
        WebElement dropDown= driver.findElement(By.cssSelector("select#state>option:nth-of-type(10)"));





    }
}
