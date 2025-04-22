package DesignPatterns.GOFFactoryPattern.Driver;

import DesignPatterns.FactoryPattern.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirefoxDriver implements Browser {

    WebDriver driver;

    @Override
    public WebDriver initializeBrowser() {
        System.out.println("Initializing Firefox browser");
        WebDriverManager.firefoxdriver().setup();
        System.out.println("Starting Firefox browser");
        return new FirefoxDriver();
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }


}
