package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test(){
        //TC #2 Upload Test
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");// we are getting the page


        //2. Find some small file from your computer, and get the path of it.

        /*  these are the necessary steps
        Windows:
#1- Right click on the file
#2- Select "properties"
#3- Go to "Security" tab
#4- Get the path from "Object name"
For windows, either double backward "\\" or single forward "/" works.
String path ="C:\\Users\\hayat\\Desktop\\note.txt

         */

        String path = "D:\\Cybertech school\\Project\\sprint 2\\rsz_british_short_hair.jpg";// located the file
        // from the computer, passing the path for the file

        //3. Upload the file.
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));// uploaded the element
        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
       uploadButton.click();


        //4. Assert:
        //-File uploaded text is displayed on the page
        WebElement fileUploadedHeader=Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());
    }
}
