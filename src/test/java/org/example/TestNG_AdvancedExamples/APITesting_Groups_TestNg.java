package org.example.TestNG_AdvancedExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Groups_TestNg {

    // If user has never grouped then Tc's will run acc. to alphabets

    @Test(groups = {"sanity"})
    public void test_sanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"regression"})
    public void test_regRun(){
        System.out.println("Regression");
        Assert.assertTrue(false);
    }

    @Test(groups = {"smoke"})
    public void test_smokeRun(){
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}
