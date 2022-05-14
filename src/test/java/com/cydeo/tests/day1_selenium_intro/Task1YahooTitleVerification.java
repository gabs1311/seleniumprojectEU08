package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1YahooTitleVerification {

    private static Object consent;


    public static void main(String[] args) {


        //  TC #1: Yahoo Title Verification

        // do setup for browser driver
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();


        // Make our page full screen
        driver.manage().window().maximize();


        //2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com/%22");

        WebElement acceptButton= driver.findElement(By.tagName("button"));
        acceptButton.click();

       // WebElement clickOnUsingButton=driver.findElement(By.xpath("//*[@id="consent-page"]/div/div/div/form/div[2]/div[2]/button"));

      //  clickOnUsingButton.click();



        //Expected: Yahoo
        String expectedTitle = "Yahoo|Mail,Stiri,Sporturi,Mobile,Vreme,Mai multe";

        // actual title comes from the browser
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else{
            System.out.println(" Title is NOT as expected. VERIFICATION FAILED!");
        }


    }


}
