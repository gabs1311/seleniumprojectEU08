package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JSExecutor {

@Test
    public void task7_scroll_task(){

    //TC #7: Scroll using JavascriptExecutor
    //1- Open a chrome browser
    //2- Go to: https://practice.cydeo.com/large
    Driver.getDriver().get(" https://practice.cydeo.com/large");


    WebElement cydeoLink= Driver.getDriver().findElement(By.linkText("CYDEO"));
    WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
    // Downcasting our driver type to JavascriptExecutor, so we are able to use the methods that come from that interface
    JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();

    js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);// cydeoLink is index nr 0

    //3- Scroll down to “Cydeo” link
    BrowserUtils.sleep(2);// not necessary, it is placed here just for educational purpose,
    // to be able to see the movement. But in real coding it is not to be placed
    js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);

    //4- Scroll up to “Home” link
    BrowserUtils.sleep(2);
  //  js.executeScript("arguments[1].scrollIntoView(true)", cydeoLink, homeLink);// cydeoLink is index 0, homeLink is index 1

    js.executeScript("arguments[0].scrollIntoView(true)",  homeLink);

    //objects
    //cydeoLink          0
    //homeLink           1
    //someOtherLink      2

    //5- Use below provided JS method only
    //JavaScript method to use : arguments[0].scrollIntoView(true)
    //Note: You need to locate the links as web elements and pass them as
    //arguments into executeScript() method
}


}
/*
TC #7: Scroll using JavascriptExecutor
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/large
3- Scroll down to “Cydeo” link
4- Scroll up to “Home” link
5- Use below provided JS method only
JavaScript method to use : arguments[0].scrollIntoView(true)
Note: You need to locate the links as web elements and pass them as
arguments into executeScript() method
 */