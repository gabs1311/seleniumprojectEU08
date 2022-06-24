package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class WebDriverWaitPractices {

    @Test

    public void dynamic_load_7_test(){

        //TC#4 : Dynamically Loaded Page Elements 7
        //1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get(" https://practice.cydeo.com/dynamic_loading/7");
        //2. Wait until title is “Dynamic title”
        //3. Assert: Message “Done” is displayed.
        //4. Assert: Image is displayed.
        //Note: Follow POM
    }
}
