package com.cydeo.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    /*
    TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” word
     */
    public static void main(String[] args) {


        //TC#3: Google search
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get(" https://google.com ");
        //3- Write “apple” in search box

        //4- Click google search button
        //5- Verify title:
        //Expected: Title should start with “apple” word


    }
}
