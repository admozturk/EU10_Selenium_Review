package Eu10Selenium.Review.Test.week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_Method {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");
        // id is unique
        WebElement footpage = driver.findElement(By.id("page-footer"));
        System.out.println(footpage.getText());
        System.out.println(footpage.getTagName());
        // Locator linkText
        WebElement brokenLink = driver.findElement(By.linkText("Broken Images"));
        System.out.println(brokenLink.getText());
        brokenLink.click();
        // locator partialLinkText
        WebElement checkbox = driver.findElement(By.partialLinkText("Check"));
        System.out.println(checkbox.getText());

        // whenever you give apart od the text pay attention it will return the first matching element
        WebElement dynamicLoading = driver.findElement(By.partialLinkText("Dynamic"));
        System.out.println(dynamicLoading.getText()); // result is Dynamic content

        // By name
        WebElement meta = driver.findElement(By.name("viewport"));
        System.out.println(meta.getText());

        // By className
        WebElement title = driver.findElement(By.className("h1"));
        System.out.println(title.getText());


        WebElement title1 = driver.findElement(By.className("h2"));
        System.out.println(title1.getText());

        //by. TagName
        WebElement ablink = driver.findElement(By.partialLinkText("A/B Test"));

        WebElement username = driver.findElement(By.name("username"));



    }
}
