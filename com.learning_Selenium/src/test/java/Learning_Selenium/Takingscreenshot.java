package Learning_Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import Generic_Utilities.BaseTest;

public class Takingscreenshot {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void screenshot() {
        driver.get("https://www.flipkart.com");
        BaseTest.takeScreenshot(driver, "flipkart_1");
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
