package selenium.testNG.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodExample {

    @BeforeMethod
    public void method1(){
        System.out.println("Before Method1");
    }

    @Test
    public void case1(){
        System.out.println("Case 1");
    }

    @Test
    public void case2(){
        System.out.println("Case 1");
    }

    @AfterMethod
    public void afterMethod1(){
        System.out.println("After Method1");
    }
}
