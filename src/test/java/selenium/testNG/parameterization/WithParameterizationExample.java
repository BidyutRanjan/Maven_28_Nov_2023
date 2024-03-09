package selenium.testNG.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithParameterizationExample {

    public WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethodTestDemo(String browserName){

        if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

            System.setProperty("WebDriver.gecko.driver", "D:\\Driver\\geckodriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.setBinary("C:\\Program Files\\Internet Explorer\\iexplore.exe");

            System.setProperty("WebDriver.edge.driver", "D:\\Driver\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("please select correct browser");
        }
    }

    @Parameters({"courseName","cityName"})

    @Test
    public void verifyGoogleSearch2(String courseName, String cityName)throws InterruptedException {

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("Selenium " + "Pune");
        googleSearchBox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        driver.close();
    }
}
