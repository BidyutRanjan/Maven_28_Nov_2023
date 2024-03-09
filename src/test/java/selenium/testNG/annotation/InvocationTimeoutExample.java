package selenium.testNG.annotation;

import org.testng.annotations.Test;

public class InvocationTimeoutExample {

    @Test(invocationCount = 2000000,invocationTimeOut = 1)
    public void iCountExample(){
        System.out.println("I count Method");
    }
}
