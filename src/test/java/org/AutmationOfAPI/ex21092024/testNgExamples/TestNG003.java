package org.AutmationOfAPI.ex21092024.testNgExamples;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG003 {
    @BeforeTest
    public void getToken(){
       System.out.println("1");
    }
    @BeforeTest
    public void getBoookingID(){
        System.out.println("2");
    }
    @Test
    public void Test01(){
        System.out.println("3");

    }


}



