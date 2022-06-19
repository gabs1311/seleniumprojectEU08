package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){
       // Creating Faker object to reach methods
        Faker faker = new Faker();
        //Faker faker = new Faker(new Locale("fr"));
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        // numerify() method will generate random numbers in the format we want to get. We use # to replace the random numbers
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));
        // the part that I want to make sure it appears in the string I can type in
        System.out.println("faker.numerify(\"0742-###-###\") = " + faker.numerify("0742-###-###"));

        // letterify( methid will generate random letters. We use ? to replace the letter that are about to be generated

        System.out.println("faker.letterify(\"????????\") = " + faker.letterify("????????"));

        System.out.println("faker.bothify(\"###??-??-###?#?#?#\") = " + faker.bothify("###??-??-###?#?#?#"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.finance().creditCard().replaceAll(\"-\",\"\") = " + faker.finance().creditCard().replaceAll("-", ""));
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\", \"Muhtar\") = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));









    }
}
