package DesignPatterns.GOFFactoryPattern.Driver;

import DesignPatterns.FactoryPattern.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MyEdgeDriverWithCapabilities implements Browser {

    WebDriver driver;

    @Override
    public WebDriver initializeBrowser() {
        System.out.println("Initializing Edge Browser with capabilities...");
        WebDriverManager.edgedriver().setup();

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");

        System.out.println("Starting Edge browser in headless mode");
        return new EdgeDriver(options);
    }
    @Override
    public WebDriver getDriver() {
        return driver;
    }
}
