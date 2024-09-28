package org.AutmationOfAPI.ex21092024.testNgExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

//Dependson
public class TestNG006 {
    @Test
    public void ServerStart(){
        System.out.println(" I will run first");// this will run first always
        Assert.assertTrue(false);// If this will fail then execution stop
    }
    @Test(dependsOnMethods = "ServerStart")// if we not use depends on the method 1 will run
    // first but A/C to logic server methid should run first
    public void Method1(){
        System.out.println("Test Method 1");// this upon Serverstart
        Assert.assertTrue(false);
    }
    @Test(priority = 2)
    public void test1(){
        System.out.println("I am on priority 1");
    }

    @Test(priority = 1)
    public void test2(){
        System.out.println("I am on priority 2");
    }

    @Test(dependsOnMethods = "ServerStart" )
    public void test3(){
        System.out.println("I am on priority 2");
        Assert.assertTrue(false);
    }
}
