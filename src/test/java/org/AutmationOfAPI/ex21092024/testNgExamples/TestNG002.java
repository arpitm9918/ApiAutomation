package org.AutmationOfAPI.ex21092024.testNgExamples;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG002 {
    // PUT
    String token;
    Integer bookingID;

    @BeforeTest
    public String getToken() {
        token = "123";
        return token;
    }

    @BeforeTest
    public void getTokenAndBookingID() {
        // POST Req -
        // POST code
        bookingID = 123;
    }


    @Test
    public void testPUTReq() {
        System.out.println(token);
        System.out.println(bookingID);
    }

    @Test
    public void testPUTReq2() {
        System.out.println(token);
        System.out.println(bookingID);
    }

    @Test
    public void testPUTReq3() {
        System.out.println(token);
        System.out.println(bookingID);
    }
}
