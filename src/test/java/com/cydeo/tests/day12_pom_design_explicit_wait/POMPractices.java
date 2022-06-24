package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class POMPractices {
    LibraryLoginPage libraryLoginPage;
    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage=new  LibraryLoginPage();// this is the line that is actually creating the
        // line itself. We are calling the constructor, and the constructor is creating the object
    }




    @Test
    public void required_field_error_message_test(){

        //TC #1: Required field error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com


        //3- Do not enter any information
        //4- Click to “Sign in” button

      libraryLoginPage.signInButton.click();
        //5- Verify expected error is displayed:
        //Expected: This field is required.


        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());
        //NOTE: FOLLOW POM DESIGN PATTERN

        Driver.closeDriver();
    }


    @Test
    public void Invalid_email_format_error_message_test() {
        //TC #2: Invalid email format error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com/

        //3- Enter invalid email format

      //  libraryLoginPage.inputUsername.sendKeys("somethingwrong@dvafvaf.com");
        libraryLoginPage.inputUsername.sendKeys("somethingwrong@dvafvaf.com");

        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void library_negative_login_test(){

        //TC #3: Library negative login
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com


        //3- Enter incorrect username or incorrect password
        libraryLoginPage.inputUsername.sendKeys("wrong@username.com");
        libraryLoginPage.inputPassword.sendKeys("wrongpassword");
        libraryLoginPage.signInButton.click();
        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        //NOTE: FOLLOW POM DESIGN PATTERN

        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
        Driver.closeDriver();
    }




}
