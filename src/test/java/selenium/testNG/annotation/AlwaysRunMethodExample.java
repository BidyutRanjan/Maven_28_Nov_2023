package selenium.testNG.annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunMethodExample {


    @Test(groups = {"smoke"})
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test
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
