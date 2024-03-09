package selenium.testNG.annotation;

import org.testng.annotations.*;

public class AfterClassBeforeClassAnnotation {

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void method1(){
        System.out.println("Before Method1");
    }

    @Test
    public void case1(){
        System.out.println("Test Case1");
    }

    @Test
    public void case2(){
        System.out.println("Test Case2");
    }

    @AfterMethod
    public void afterMethod1(){
        System.out.println("After Method1");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }
}
