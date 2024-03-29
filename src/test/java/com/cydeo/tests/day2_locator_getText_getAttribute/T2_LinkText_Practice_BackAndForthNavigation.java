package com.cydeo.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice_BackAndForthNavigation {

    /*
    TC #2: Back and forth navigation
1- Open a chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
4- Verify title is:
Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
Expected: Practice
     */


    public static void main(String[] args) {


        //TC #2: Back and forth navigation
        //1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com

        driver.get(" https://practice.cydeo.com ");

        //3- Click to A/B Testing from top of the list.
        // thread.sleep(2000);
        driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink= driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        //4- Verify title is:
        //Expected: No A/B Test

        String expectedTitle=" No A/B Test";
        String actualTitle =driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");}


        //5- Go back to home page by using the .back();

        driver.navigate().back();
        //6- Verify title equals:
        //Expected: Practice
        String expectedTitle2 = "Practice";
        actualTitle= driver.getTitle();
        if (actualTitle.equals(expectedTitle2)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println(" Title verification FAILED");
        }
    }
}