package com.cydeo.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4_PractticeCydeo_ClassLocatorPractice {
    public static void main(String[] args) {
        /*
        TC #4: Practice Cydeo – Class locator practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice
PS: Locate “Home” link using “className” locator
         */

        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");
        //3- Click to “Home” link
        driver.findElement(By.className("nav-link"));
        //4- Verify title is as expected:
        //Expected: Practice
        if (driver.getTitle().equals("Practice")) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
            //PS: Locate “Home” link using “className” locator

        }
    }
}
