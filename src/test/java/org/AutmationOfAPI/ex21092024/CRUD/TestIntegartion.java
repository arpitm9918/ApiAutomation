package org.AutmationOfAPI.ex21092024.CRUD;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class TestIntegartion {
    //Create A token
    //Create Nooking
    //Perform A put request
    //verify that put is getting suceed by Get request
    //Delete ID
    //Verify it doesn't exist get request
    //Note:- We can run test cases sequencely by using
    // 1.Priority,
    // 2.By nameing the test case alphabatically
    //3. By using dependson method and
    //4. you can also use <methods> <include name="method name" </include>..</methods> in testng.xml file

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    String bookingid;

    public String getToekn(){// This is Method
        String payload = "{\n" +
                "                    \"username\" : \"admin\",\n" +
                "                    \"password\" : \"password123\"\n" +
                "                }";

        // Given - Request Spec
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);

        // When -     Response
        Response response = r.when().post();


        // Then - ValidatableResponse
        // Validation
        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);
        token = response.jsonPath().getString("token");
        System.out.println(token);
        return token;

    }

    public String getBookingID(){
        String payloadPost= "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Dutta\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/");
        requestSpecification.contentType(ContentType.JSON);
    //    requestSpecification.cookie("token",token);
        requestSpecification.body(payloadPost).log().all();

        Response response = requestSpecification.when().post();
        // Get Validatable response to perform validation
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        bookingid= response.jsonPath().getString("bookingid");
        System.out.println(bookingid);
        return bookingid;

    }
    //@Test(priority=1) //Priority wise sequencing
   @Test
   //public void test_01_update_request_put(){//Alphabatically wise sequencing
    public void test_update_request_put(){
        token=getToekn();
        bookingid=getBookingID();
        String payloadPUT= "{\n" +
                "    \"firstname\" : \"Arpit\",\n" +
                "    \"lastname\" : \"Mishra\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);
        requestSpecification.body(payloadPUT).log().all();

        Response response = requestSpecification.when().put();


        // Get Validatable response to perform validation
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

    }
    //@Test(priority = 2) //Priority wise sequencing
   // @Test(dependsOnMethods = "test_update_request_put") // Dependons method using sequencing
    @Test
    //public void test_02_update_request_get(){//AlphabaticaLLY wise sequencing
        public void test_update_request_get(){
        System.out.println(bookingid);

    }
    //@Test(priority = 3) //Priority wise sequencing
    //@Test(dependsOnMethods = "test_update_request_get")//Dependons method using sequencing
    @Test
    //public void test_03_delete_booking(){////AlphabaticaLLY wise sequencing
        public void test_delete_booking(){
        System.out.println(bookingid);
        System.out.println(token);

    }

   // @Test(priority = 4) //Priority wise sequencing
    //@Test(dependsOnMethods = "test_delete_booking") //Dependons method using sequencing
    @Test //Priority wise sequencing
    //public void test_04_after_delete_booking(){////AlphabaticaLLY wise sequencing
        public void test_after_delete_booking(){
        System.out.println(bookingid);

    }
}
