package com.cydeo.tests.day5_testNG_Intro_Dropdowns;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T6_dropdownPractice {

    @BeforeMethod
    public void SetupMethod() {
    }
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/dropdown

}

@Test
public void dropdown() {
//3. Select “December 1st, 1923” and verify it is selected.
//Select year using : visible text
//Select month using : value attribute
//Select day using : index number


}
@AfterClass
public void shutdown() {
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