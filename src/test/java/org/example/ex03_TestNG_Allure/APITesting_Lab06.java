package org.example.ex03_TestNG_Allure;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab06 {

    String pinCode= "110048";

//BDD Style

    @Test
    public void test_GET_POSITIVE_TC1(){
        pinCode= "110048";
        RestAssured
                .given()
                .baseUri("https://zippopotam.us/")
                .basePath("IN/"+pinCode)
                .when().get()
                .then().log().all().statusCode(200);

    }
    @Test(enabled = false)
    public void test_GET_NEGATIVE_TC2(){
        pinCode=" ";
        RestAssured
                .given()
                .baseUri("https://zippopotam.us/")
                .basePath("IN/"+pinCode)
                .when().get()
                .then().log().all().statusCode(200);
    }
    @Test
    public void test_GET_NEGATIVE_TC3(){
        pinCode="@";
        RestAssured
                .given()
                .baseUri("https://zippopotam.us/")
                .basePath("IN/"+pinCode)
                .when().get()
                .then().log().all().statusCode(200);
    }

}
