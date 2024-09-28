package org.AutmationOfAPI.ex21092024.testNgExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

//Grouping of TestCases
//why we use this
//ans is if someone says I want to run only snaity or Reg or Smoke or Sanity and QA both then we use this
//to perform this we use @Test(group='') anotation.
public class TestNG005 {
    @Test(groups = {"QA", "Sanity", "preprod"})//This test case for QA, Sanity, e2e
    public void SanityRun(){
        System.out.println("Sanity Test Case");
        System.out.println("QA");
        Assert.assertTrue(true);
    }
    @Test(groups = {"QA", "preprod"})// this test case only for QA
    public void RegRun(){
        System.out.println("Reg Test Cases");
    }
    @Test(groups = {"Dev", "Stage"})//this Test case only for dev
    public void SmokeRun(){
        System.out.println("Smoke test Cases");
        Assert.assertTrue(true);
    }
}
