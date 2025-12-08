package org.example.HTTP_Methods;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

@Test
public class NonBDDStyle_GET {

    //Non BDD Style
    RequestSpecification r;   //Given
    Response response;        //when
    ValidatableResponse ve;   //then
    String pinCode;

    public void GET_NON_BDD(){
        pinCode="560049";
        //Part 1 - GIVEN
        r= RestAssured.given();
        r.baseUri("https://zippopotam.us/");
        r.basePath("/IN/"+pinCode);

        //Part 2 - WHEN
        response = r.when().log().all().get();
        System.out.println(response.asString());

        //Part 3 - Then

        ve = response.then().log().all();
        ve.statusCode(200);
    }
}
