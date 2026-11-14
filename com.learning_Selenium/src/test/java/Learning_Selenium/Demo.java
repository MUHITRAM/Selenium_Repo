package Learning_Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Demo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://www.google.com/travel/flights");

            JavascriptExecutor js =(JavascriptExecutor) driver;

            String pageText = (String) js.executeScript(
                "return document.body.innerText;"
            );

            System.out.println("Flight Details:");
            System.out.println(pageText);

        }
        finally {
            driver.quit();
        }
    }
}