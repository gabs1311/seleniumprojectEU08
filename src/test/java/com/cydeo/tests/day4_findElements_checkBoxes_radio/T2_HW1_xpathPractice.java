package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_HW1_xpathPractice {
    public static void main(String[] args) {

        /*
        XPATH Practice
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #6: XPATH LOCATOR practice
1. Open Chrome browser
2. Go to http://practice.cydeo.com/multiple_buttons
3. Click on Button 1
4. Verify text displayed is as expected:
Expected: “Clicked on button one!”
USE
         */


        //XPATH Practice
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #6: XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

        //3. Click on Button 1

        WebElement button1 = driver.findElement(By.xpath("//button[@class = 'btn btn-primary']"));
       button1.click();
        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        String expectedClickOnButton1Text = "Clicked on button one!";
        String actualClickOnButton1Text = driver.findElement(By.xpath("//p[@id='result']")).getText();
        //USE
        if (actualClickOnButton1Text.equals(expectedClickOnButton1Text)){
            System.out.println("Button 1 text display verification PASSED");
        }else {
            System.out.println("Button 1 text display verification FAILED");
        }
    }

}
