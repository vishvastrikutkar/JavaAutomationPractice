package DesignPatterns.FactoryPattern.Driver;

import DesignPatterns.FactoryPattern.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class MyEdgeDriver implements Browser {

    WebDriver driver;

    @Override
    public WebDriver initializeBrowser() {
        System.out.println("Initializing Edge Browser...");
        WebDriverManager.edgedriver().setup();
        System.out.println("Starting Edge browser");
        return new org.openqa.selenium.edge.EdgeDriver();
    }
    @Override
    public WebDriver getDriver() {
        return driver;
    }
}
