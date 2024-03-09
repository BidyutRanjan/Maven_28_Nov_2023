package selenium.testNG.failedtestcaseapproach;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class ManualFailedTestCaseExample {

    @Test(retryAnalyzer = IRetryAnalyzer.class)
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test(retryAnalyzer = IRetryAnalyzer.class)
    public void verifyLogin2(){
        Assert.assertTrue(true);
        System.out.println("Verify Login 2");
    }

    @Test(retryAnalyzer = IRetryAnalyzer.class)
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }

    @Test(retryAnalyzer = IRetryAnalyzer.class)
    public void verifyFundsTransfer(){
        System.out.println("Verify Funds Transfer");
    }

    @Test(retryAnalyzer = IRetryAnalyzer.class)
    public void verifyMyCashBack(){
        System.out.println("Verify My cashback offer");
    }
}
