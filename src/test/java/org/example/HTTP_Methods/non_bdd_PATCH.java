package org.example.HTTP_Methods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class non_bdd_PATCH {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void non_bdd_patch(){
        String token = "b183ef080dd2d63";
        String bookingId = "1597";
        String Payload = "{\n" +
                "    \"firstname\" : \"Vishal\",\n" +
                "    \"lastname\" : \"Rokade\"\n" +
                "}";

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" +bookingId);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);

        r.body(Payload).log().all();

        response = r.when().log().all().patch();

        vr= response.then().log().all();
        vr.statusCode(200);
    }
}
