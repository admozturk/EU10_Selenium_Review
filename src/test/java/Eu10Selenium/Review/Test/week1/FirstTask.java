package Eu10Selenium.Review.Test.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/");

        WebDriver driver1 = new FirefoxDriver();
        driver1.navigate().to("https://www.google.com");

        driver1.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        WebElement searchimecekoyu = driver1.findElement(By.name("q"));
        searchimecekoyu.sendKeys("Imece koyu"+ Keys.ENTER);





    }
}
