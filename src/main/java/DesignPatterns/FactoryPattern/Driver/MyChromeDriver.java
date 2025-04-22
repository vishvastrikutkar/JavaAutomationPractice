package DesignPatterns.FactoryPattern.Driver;

import DesignPatterns.FactoryPattern.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class MyChromeDriver implements Browser {
    WebDriver driver;

    @Override
    public WebDriver initializeBrowser() {
        System.out.println("Initializing Chrome browser");
        WebDriverManager.chromedriver().setup();
        System.out.println("Starting Chrome browser");
        return new org.openqa.selenium.chrome.ChromeDriver();
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }


}
