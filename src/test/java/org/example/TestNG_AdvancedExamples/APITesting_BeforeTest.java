package org.example.TestNG_AdvancedExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_BeforeTest {

    @BeforeTest
    public void getToken(){
        System.out.println("Token First");
    }

    @BeforeTest
    public void bookingID(){
        System.out.println("Before GET Booking");
    }

    @Test
    public void TEST_PUT(){
        System.out.println("PUT Request");
    }

    @AfterTest
    public void closeAllThings(){
        System.out.println("CloseAllThings");
    }
}
