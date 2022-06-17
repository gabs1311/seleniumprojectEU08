package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {

        public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
    driver= WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

@Test
    public void crm_login_test() {



    //2. Go to : https://login1.nextbasecrm.com/

    driver.get("https://login1.nextbasecrm.com/  ");
    //3. Enter valid username

    WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
    //4. Enter valid password
    WebElement inputPassword= driver.findElement(By.xpath(" USER_PASSWORD"));
    //5. Click to `Log In` button
    //6. Verify title is as expected:

}


}
