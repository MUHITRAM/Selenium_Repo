package Learning_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Select_class {

    WebDriver driver;

    @BeforeSuite
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testMethod() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        
        WebElement element = driver.findElement(By.id("cars"));
        Select sel=new Select(element);
        sel.selectByIndex(0);
        sel.selectByVisibleText("Saab");
        sel.selectByValue("audi");
        
        Thread.sleep(3000);
    }


@AfterSuite
public void quit() {
	driver.quit();
}}