package org.example.TestNG_AdvancedExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting_Parameters_TestNg {

   @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Hi, I'm the demo");
        System.out.println("You are running this param");

        if(value.equalsIgnoreCase("chrome")){
            System.out.println("You are running Chrome");
        }
        if(value.equalsIgnoreCase("firefox")){
            System.out.println("You are running Firefox");
        }
    }
}
