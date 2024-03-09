package selenium.testNG.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void softAssertDemo(){

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();

        SoftAssert softAssert = new SoftAssert();

        WebElement loginBox = driver.findElement(By.id("login1"));

        softAssert.assertEquals(title, "rediffmail", "Title should be Matched");

        softAssert.assertTrue(loginBox.isDisplayed(), "Login text box should be displayed");
        System.out.println("hello");

        softAssert.assertAll();

        driver.close();
    }
}
