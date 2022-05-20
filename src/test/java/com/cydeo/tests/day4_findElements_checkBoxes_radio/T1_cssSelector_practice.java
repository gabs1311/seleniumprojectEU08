package com.cydeo.tests.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_cssSelector_practice {
    public static void main(String[] args) {
        /*
        XPATH and CSS Selector PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible
Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible
         */


        //XPATH and CSS Selector PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS

        //locator only (total of 6)
        //a. “Home” link
        // locate homeLink using cssSelector, class value
       WebElement homeLink_ex1  = driver.findElement(By.cssSelector("a[class ='nav-link']"));

        // locate homeLink using cssSelector#2
        WebElement homeLink_ex2  = driver.findElement(By.cssSelector("a.nav-link"));

        // locate homeLink using cssSelector#3, href value
      WebElement homeLink_ex3  = driver.findElement(By.cssSelector("a[href='/']"));


       WebElement homeLink_ex4  = driver.findElement(By.cssSelector("a[class ='nav-link']"));

        //b. “Forgot password” header

        //Locate header using cssSelector: locate parent element and move down to h2
        WebElement headerEx1 = driver.findElement(By.cssSelector("div.example>h2"));

        //Locate header using Xpath and using element text " Forgot Password"

       // WebElement headerEx2 = driver.findElement(By.xpath("//h2[text() ='Forgot Password']"));

        // or written differently, but with the result
        WebElement headerEx2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailLabel= driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box

        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));
        //Locate  inputBoc using xpath contains method
        //tagName[contains(@attribute,'value')]

        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[@name='email']"));

        //e. “Retrieve password” button
        //button[@type='submit' ]- if I go by type
        //button[@class='radius'] - if I go by class
        // if I go by id -  see below
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));


        //f. “Powered by Cydeo text

        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        //4. Verify all web elements are displayed.
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible
    }
}
