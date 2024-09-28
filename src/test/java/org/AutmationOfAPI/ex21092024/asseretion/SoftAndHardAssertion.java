package org.AutmationOfAPI.ex21092024.asseretion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssertion {
    @Test
    public void HardAssertion(){
        Assert.assertTrue(false);//This will throuh an Assertion Error & Stop execution
        System.out.println("I will not execute if above condition fail");
    }
    @Test
    public void SoftAeertion(){
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(false);// This will not stop execution
        System.out.println("I will execute if above condotion fail");
        softAssert.assertAll(); //This will store all the aseertion
    }
}
