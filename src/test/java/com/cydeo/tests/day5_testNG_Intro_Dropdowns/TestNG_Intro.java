package com.cydeo.tests.day5_testNG_Intro_Dropdowns;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {
    @BeforeMethod
    public void setUpMethod(){
        System.out.println(" set  method is running");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 i running");
    }
    @Test
    public void test2(){
        System.out.println(" Test 2 is running");
    }
}
