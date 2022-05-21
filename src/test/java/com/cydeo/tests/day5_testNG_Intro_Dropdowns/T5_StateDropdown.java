package com.cydeo.tests.day5_testNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_StateDropdown {
    WebDriver driver;

    @BeforeMethod

    public void setUp(){
        driver=   WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }


    @Test
    public void simpleDropdown() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dropdown");


        Select selectOptions=new Select(driver.findElement(By.xpath("//select[@id='state']")));

        selectOptions.selectByIndex(14);
        Thread.sleep(2000);
        selectOptions.selectByValue("VA");
        Thread.sleep(2000);
        selectOptions.selectByVisibleText("California");

        WebElement curentSelected= selectOptions.getFirstSelectedOption();

        Assert.assertEquals(curentSelected.getText(),"California");




    }

    @AfterClass

    public void shutDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }






}
/*

TC #5: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)



 */