package com.cydeo.tests.day2_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetTextGetAttribute {

    public static void main(String[] args) {

      /*
        TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
Expected: first name
       */

        //TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h2"));
        //Expected: Registration form
        String expectedHeaderText="Registration form";
        String actualHeaderText = headerText.getText();// wil return "Registration form" as String


        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header text verification PASSED");
        }else{
            System.out.println("Header text verification FAILED");
        }
        //4- Locate “First name” input box// on this line, we are location the web element itself
        WebElement firstNameInput = driver.findElement(By.name("firstname"));



        //5- Verify placeholder attribute’s value is as expected:
        // Expected: first name// in this line we are trying to get one of the atribute's value
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Placeholder text verification PASSED!");
        }else{
            System.out.println("Placeholder text verification FAILED!!!");
        }






    }
}
