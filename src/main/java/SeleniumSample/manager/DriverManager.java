package SeleniumSample.manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager {

    WebDriver driver;
    public WebDriver setupDriver(BrowserType browser)
    {
        switch (browser){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver();
                driver=new EdgeDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        return driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
