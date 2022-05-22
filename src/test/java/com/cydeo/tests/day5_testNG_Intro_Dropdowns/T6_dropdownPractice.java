package com.cydeo.tests.day5_testNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_dropdownPractice {
WebDriver driver;
    @BeforeMethod
    public void Setup() {

//1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");


    }

@Test
public void dropdownTest() throws InterruptedException {




//3. Select “December 1st, 1923” and verify it is selected.


//Select year using : visible text
    Select year=new Select(driver.findElement(By.xpath("//select[@id='year']")));
    year.selectByVisibleText("1923");

//Select month using : value attribute
    Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
    month.selectByVisibleText("December");

//Select day using : index number
    Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
    day.selectByVisibleText("1");


    Assert.assertEquals(year.getFirstSelectedOption().getText(),"1923");
    Assert.assertEquals(month.getFirstSelectedOption().getText(),"December");
    Assert.assertEquals(day.getFirstSelectedOption().getText(),"1");


}
@AfterClass
public void shutdown() throws InterruptedException {

    Thread.sleep(3500);
    driver.close();
}

}
/*TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
Select year using : visible text
Select month using : value attribute
Select day using : index number

 */