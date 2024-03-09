package selenium.testNG.annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExample {
    public WebDriver driver;
    @BeforeMethod
    public void beforeMethodExample(){
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void testCase1() throws InterruptedException {
        driver.navigate().to("https://www.abhibus.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @Test
    public void testCase2() throws InterruptedException {
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @Test
    public void testCase3() throws InterruptedException {
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @AfterMethod
    public void afterMethodExample(){
        driver.close();
    }
}
