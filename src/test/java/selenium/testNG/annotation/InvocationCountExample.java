package selenium.testNG.annotation;

import org.testng.annotations.Test;

public class InvocationCountExample {

    @Test(invocationCount = 20)
    public void iCountExample(){
        System.out.println("I count Method");
    }
}
