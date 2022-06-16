package com.cydeo.tests.day7_webTables_utilities;


import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_window_handling {
    public WebDriver driver;
    private WebDriverFactory Driver;
    private WebElement agreeButton;


    //1. Create new test and make set ups
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void window_handling_test() {


//2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");
//3. Copy paste the lines from below into your class

        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");


        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        // driver.findElement(By.xpath("//button[.='Sunt de acord']")).click();


        WebElement FbAllowCookieButton2;
        //  driver.findElement(By.xpath("//button[. = 'Allow essential and optional cookies']")).click();


        String browserType = null;
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com");
            WebElement agreeButton = (WebElement) driver.findElements(By.xpath("//button[. = 'Allow essential and optional cookies']"));
            agreeButton.click();

            //4. Create a logic to switch to the tab where Etsy.com is open

            //5. Assert: Title contains “Etsy”

            //Lines to be pasted:

            //((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
            //((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
            //((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
        }
    }
}
