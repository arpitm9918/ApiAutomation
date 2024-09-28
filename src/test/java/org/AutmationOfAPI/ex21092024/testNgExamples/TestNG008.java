package org.AutmationOfAPI.ex21092024.testNgExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG008 {
    @Test
    public void Test1(){
        Assert.assertTrue(false);
    }
    @Test(enabled = false)
    public void Test2(){
        System.out.println("");
        Assert.assertTrue(false);
    }
    @Test(alwaysRun = true)
    public void Test3(){
Assert.assertTrue(true);
    }
}
