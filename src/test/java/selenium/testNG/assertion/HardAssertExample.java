package selenium.testNG.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void hardAssert(){

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        String title = driver.getTitle();

        WebElement loginBox = driver.findElement(By.id("login1"));

        Assert.assertEquals(title, "Rediffmail", "Title should be Matched" );

        Assert.assertTrue(loginBox.isDisplayed(), "Login text box should be displayed");
        driver.manage().window().maximize();

        driver.close();
    }
}
