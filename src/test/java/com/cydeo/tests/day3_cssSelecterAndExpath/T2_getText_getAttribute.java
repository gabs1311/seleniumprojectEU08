package com.cydeo.tests.day3_cssSelecterAndExpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    /*TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
 1- Open a chrome browser
 2- Go to: https://login1.nextbasecrm.com/
 3- Verify “remember me” label text is as expected:
 Expected: Remember me on this computer
 4- Verify “forgot password” link text is as expected:
 Expected: Forgot your password?
 5- Verify “forgot password” href attribute’s value contains expected:
 Expected: forgot_password=yes
 PS: Inspect and decide which locator you should be using to locate web
 elements.

     */
    public static void main(String[] args) {


        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel= driver.findElement(By.className("login-item-checkbox-label"));
       String expectedRemeberMeLabel = "Remember me on this computer";
       String actualRememberMeLabel= rememberMeLabel.getText();
       if (expectedRemeberMeLabel.equals(actualRememberMeLabel)){
           System.out.println("Label verification PASSED");
       }else {
           System.out.println("Label verification FAILED");
       }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgetPasswordLinkText = "Forgot your password?";
       String actualForgetPasswordLinkText = forgotPasswordLink.getText();

       if (expectedForgetPasswordLinkText.equals(actualForgetPasswordLinkText)){
           System.out.println("Password Link Test verification PASSED");
       }else{
           System.out.println("Password Link Verification FAILED");}




        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref="forgot_password=yes";
       String actualHrefAttributeValue =forgotPasswordLink.getAttribute("href");
        System.out.println("expectedInHref = " + expectedInHref);

        if (actualHrefAttributeValue.equals(expectedInHref)){
            System.out.println("Forgot password verification PASSED ");
        }else{
            System.out.println("Forgot password verification FAILED");
        }
    }
}