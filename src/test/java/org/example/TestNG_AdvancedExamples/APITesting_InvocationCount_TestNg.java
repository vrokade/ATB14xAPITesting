package org.example.TestNG_AdvancedExamples;

import org.testng.annotations.Test;

public class APITesting_InvocationCount_TestNg {

    // it means how many times do you want to run the test

    @Test(invocationCount = 2)
    public void tc1(){
        System.out.println("Hi");
    }

    @Test(invocationCount = 5)
    public void tc2(){
        System.out.println("Hello");
    }
}
