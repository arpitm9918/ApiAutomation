package org.AutmationOfAPI.ex21092024.testNgExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Parameter
public class TestNG007 {
    @Parameters("Browser")
    @Test
    void demo1(String Value){
        System.out.println("Browser is :-" +Value);

    }

}
