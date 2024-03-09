package selenium.testNG.annotation;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class FailedTestCase {

    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test
    public void verifyLogin2(){
        Assert.assertTrue(true);
        System.out.println("Verify Login 2");
    }


    @Test
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyFundsTransfer(){
        System.out.println("Verify Funds Transfer");
    }

    @Test
    public void verifyMyCashBack(){
        System.out.println("Verify My cashback offer");
    }
}
