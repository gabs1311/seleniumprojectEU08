package com.cydeo.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1_EtsyTitleVerification {
    public static void main(String[] args) {
       /*
        TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
        */


        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2. Go to https://www.etsy.com

        driver.navigate().to("https://www.etsy.com");
        //3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);



        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”

        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println(" Title verification PASSED");
        }else{
            System.out.println(" Title verification FAILED");
        }
    }
}
