package com.cydeo.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3_BackAndForthNavigation {
    public static void main(String[] args) {
        /*
        TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
         */

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        driver.findElement(By.className("gb_d")).click();

        //4- Verify title contains:
        //Expected: Gmail
        String actualTitle = driver.getTitle();
        //String expectedTitle = "Gmail";
        if(actualTitle.contains("Gmail")){// need to fix this google.ro
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }

        //5- Go back to Google by using the .back();


        driver.navigate().back();

        //6- Verify title equals:
        if (driver.getTitle().equals("Google")){
            System.out.println("Gmail Title verification PASSED!");
        }else{
            System.out.println("Google Title verification FAILED!");
        }

        driver.close();
        }
        //Expected: Google
    }


