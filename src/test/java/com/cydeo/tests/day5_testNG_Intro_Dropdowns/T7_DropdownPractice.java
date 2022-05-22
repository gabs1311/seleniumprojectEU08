package com.cydeo.tests.day5_testNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_DropdownPractice {
WebDriver driver;
@BeforeMethod
    public void setup(){
    //1. Open Chrome browser
    driver= WebDriverFactory.getDriver("Chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //2. Go to https://practice.cydeo.com/dropdown
    driver.get(" https://practice.cydeo.com/dropdown");
}

    @Test
    public void Test() {
        //3. Click to non-select dropdown

        //4. Select Facebook from dropdown
        //5. Verify title is “Facebook - Log In or Sign Up”

        WebElement theDropdownButton = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        theDropdownButton.click();

        WebElement facebookButton = theDropdownButton.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
        facebookButton.click();
        WebElement agreeButton = driver.findElement(By.xpath("(//button[@value='1'])[3]"));
        agreeButton.click();

        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle ="Facebook - Log In or Sign Up";

        Assert.assertEquals(expectedTitle,actualTitle);


}


    @AfterClass
    public void end() throws InterruptedException {
       Thread.sleep(2000);
    driver.close();
    }
}
/*
TC #7: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”
 */