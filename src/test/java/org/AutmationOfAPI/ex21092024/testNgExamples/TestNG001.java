package org.AutmationOfAPI.ex21092024.testNgExamples;


import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG001 {
    //Here the main methid is not present but we ca run this code
    //because a temporary testng file genrate that copy the @Test anotation contain
    // method in main method
    @Severity(SeverityLevel.NORMAL)//Allure report anotation
    @Description("AC = EX")//Allure report anotation
    @Test

    public void Test_case1(){



        Assert.assertEquals("true","true");
    }
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that true != false")
    @Test
    public void Test_case2(){
Assert.assertEquals("true","false");
    }

}
