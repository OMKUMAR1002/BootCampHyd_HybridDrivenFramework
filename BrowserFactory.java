package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver BrowserOptions(String browserName, String url) {

      
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }

    public static void quitBrowser(WebDriver driver) {
        driver.quit();
    }
}