package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_DoubleClick {

    @Test
    public void t1_double_click_test(){

    //TC #1: Double Click Test
        //1. Go to
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2 ");

        DoubleClickPage doubleClickPage= new DoubleClickPage();
       WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

     //  doubleClickPage.IagreeButton.click();
   //    wait.until(ExpectedConditions.invisibilityOf(doubleClickPage.IagreeButton));
        //2. Switch to iframe.

        Driver.getDriver().switchTo().frame("iframeResult");

        //3. Double click on the text “Double-click me to change my text color.”

        DoubleClickPage doubleClickPage1 = new DoubleClickPage();
        Actions actions=new Actions(Driver.getDriver());
        actions.doubleClick(doubleClickPage.textToDoubleClick).perform();
        //4. Assert: Text’s “style” attribute value contains “red”.
        System.out.println("doubleClickPage.textToDoubleClick.getAttribute(\"style\") = " + doubleClickPage.textToDoubleClick.getAttribute("style"));

      String actualStyleAttributeValue =doubleClickPage.textToDoubleClick.getAttribute("style");
      String expectedInStyleAttribute="red";

        Assert.assertTrue(actualStyleAttributeValue.contains(expectedInStyleAttribute));

        //NOTE: FOLLOW POM

    }
}
