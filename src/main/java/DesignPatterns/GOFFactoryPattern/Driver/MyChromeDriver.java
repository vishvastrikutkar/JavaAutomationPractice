package DesignPatterns.GOFFactoryPattern.Driver;

import DesignPatterns.FactoryPattern.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChromeDriver implements Browser {
    private WebDriver driver;

    @Override
    public WebDriver initializeBrowser() {
        System.out.println("Initializing Chrome browser");
        WebDriverManager.chromedriver().setup();
        System.out.println("Starting Chrome browser");
        return new ChromeDriver();
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }


}
