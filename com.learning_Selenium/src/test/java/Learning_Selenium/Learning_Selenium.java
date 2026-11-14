package Learning_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_Selenium {
	
	
	@Test(priority=1)
	public void test() throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		
		
		driver.findElement(By.name("q")).sendKeys("Mobile",Keys.ENTER);
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
	}
		
	
		@Test(priority=2)
		public void test1() throws InterruptedException {
			
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
			
			
			
			driver.findElement(By.name("q")).sendKeys("Mobile",Keys.ENTER);
			
			Thread.sleep(2000);
			
			
			driver.quit();
		
		
		
		
		
		
		
	}

}
