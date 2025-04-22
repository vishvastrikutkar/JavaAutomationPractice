package DesignPatterns.GOFFactoryPattern.Driver;

import DesignPatterns.FactoryPattern.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MyFirefoxDriverWithCapabilities implements Browser {

    WebDriver driver;

    @Override
    public WebDriver initializeBrowser() {
        System.out.println("Initializing Firefox browser with capabilities");
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");

        System.out.println("Starting Firefox browser in headless mode");
        return new FirefoxDriver(options);
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }


}
