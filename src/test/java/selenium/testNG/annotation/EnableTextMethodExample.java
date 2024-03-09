package selenium.testNG.annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnableTextMethodExample {

    @Test(groups = {"smoke"})
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test(enabled = true)
    public void verifyCashBackOffer(){
        System.out.println("Verify Cashback offer");
    }

    @Test (dependsOnGroups = {"smoke"},alwaysRun = true)
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyFundsTransfer(){
        System.out.println("Verify Funds Transfer");
    }
}
