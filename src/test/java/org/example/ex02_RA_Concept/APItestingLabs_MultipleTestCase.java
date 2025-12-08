package org.example.ex02_RA_Concept;

import io.restassured.RestAssured;

public class APItestingLabs_MultipleTestCase {

    public static void main(String[] args) {

        String pinCode = "110048";
        RestAssured
                .given()
                .baseUri("https://zippopotam.us/")
                .basePath("IN/"+pinCode)
                .when()
                .get()
                .then().log().all().statusCode(200);

         pinCode = "@";
        RestAssured
                .given()
                .baseUri("https://zippopotam.us/")
                .basePath("IN/"+pinCode)
                .when()
                .get()
                .then().log().all().statusCode(200);
    }

}
