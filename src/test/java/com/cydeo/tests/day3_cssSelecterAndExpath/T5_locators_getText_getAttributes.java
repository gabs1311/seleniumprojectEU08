package com.cydeo.tests.day3_cssSelecterAndExpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_locators_getText_getAttributes {

    /*
    TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Enter incorrect username into login box:
4- Click to `Reset password` button
5- Verify “error” label is as expected
Expected: Login or E-mail not found
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
     */
    public static void main(String[] args) {
        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browse
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        //3- Enter incorrect username into login box:
WebElement inputUsername = driver.findElement(By.className("login-inp"));
inputUsername.sendKeys("incorrect");


        //4- Click to `Reset password` button
WebElement loginButton = driver.findElement(By.className("login-btn"));
    loginButton.click();

        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found
        WebElement errorMessage= driver.findElement(By.className("errortext"));
String expectedErrorMessage = "Login or E-mail not found";
String actualErrorMessage = errorMessage.getText();

     if (actualErrorMessage.equals(expectedErrorMessage)){
         System.out.println("Error message verification PASSED" );
     }else {
         System.out.println("Error message verification FAILED");

     }


        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from
    }
}
