package org.example.HTTP_Methods;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class non_bdd_style_PUT {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    // if u want to use random name then use Faker Library

    Faker faker = new Faker();
    String name = faker.name().fullName();

    @Test
    public void test_put_nonBDD(){
        String token = "0e5ec079536e5ba";
        String bookingID = "294";
        String payLoad = "{\n" +
                "    \"firstname\" : \"+"+name+"+\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" +bookingID);

        r.contentType(ContentType.JSON);
        r.cookie("token",token);

        r.body(payLoad).log().all();


        response = r.when().log().all().put();

        vr = response.then().log().all();
        vr.statusCode(200);

    }
}
