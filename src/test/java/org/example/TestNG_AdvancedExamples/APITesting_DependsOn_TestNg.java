package org.example.TestNG_AdvancedExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_DependsOn_TestNg {

    @Test
    public void serverStartedOk(){
        System.out.println("I'll run first");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void test1(){
        System.out.println("methode 1");
        Assert.assertTrue(true);
    }
}
