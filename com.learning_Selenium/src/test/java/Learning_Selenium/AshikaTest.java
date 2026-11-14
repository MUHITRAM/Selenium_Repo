package Learning_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AshikaTest {
	
	@Test()
		public void Ashi1() throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();

options.addArguments("--headless=new");
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");
options.addArguments("--disable-gpu");
options.addArguments("--window-size=1920,1080");

WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium",Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}

}
