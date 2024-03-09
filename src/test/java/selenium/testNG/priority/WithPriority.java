package selenium.testNG.priority;

import org.testng.annotations.Test;

public class WithPriority {

    @Test(priority = 6)
    public void testScriptA(){
        System.out.println("Test Script A");
    }

    @Test(priority = 1)
    public void testScriptB(){
        System.out.println("Test Script B");
    }

    @Test(priority = 3)
    public void testScriptE(){
        System.out.println("Test Script E");
    }

    @Test(priority = 5)
    public void testScriptD(){
        System.out.println("Test Script D");
    }

    @Test(priority = 4)
    public void testScriptF(){
        System.out.println("Test Script F");
    }

    @Test(priority = 2)
    public void testScriptC(){
        System.out.println("Test Script C");
    }
}
