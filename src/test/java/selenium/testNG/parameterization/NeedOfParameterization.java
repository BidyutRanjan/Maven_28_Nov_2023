package selenium.testNG.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfParameterization {

    @Test
    public void verifyGoogleSearch() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("Selenium " + "Pune");
        googleSearchBox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        driver.close();
    }
}
