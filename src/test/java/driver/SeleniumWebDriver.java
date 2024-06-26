package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver {
    public static WebDriver driver;


    public static  WebDriver initChrome() {
        System.setProperty("webdriver.chrome.driver", "/Users/varinderjassal/Downloads/driver/chromedriver");
   driver = new ChromeDriver();
    return driver;
}
    public static void closeDriver() {
    driver.quit();
}

    public static WebDriver getWebDriver() {
        return driver;
    }
}
