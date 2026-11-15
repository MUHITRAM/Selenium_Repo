
package Generic_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    public static WebDriver createDriver() {

        ChromeOptions options = new ChromeOptions();

        // Detect GitHub Actions environment
        String ciEnvironment = System.getenv("CI");

        if ("true".equalsIgnoreCase(ciEnvironment)) {

            // GitHub Actions - Headless execution
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");

            System.out.println("Running Chrome in CI Headless Mode");

        } else {

            // Local Eclipse execution
            options.addArguments("--start-maximized");

            System.out.println("Running Chrome in Local Mode");
        }

        return new ChromeDriver(options);
    }
}
