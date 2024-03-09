package selenium.testNG.annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    @Test(groups = {"smoke"})
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }

    @Test
    public void verifyCashBackOffer(){
        System.out.println("Verify Cashback offer");
    }

    @Test (dependsOnGroups = {"smoke"})
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyFundsTransfer(){
        System.out.println("Verify Funds Transfer");
    }
}
