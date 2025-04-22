package DesignPatterns.GOFFactoryPattern.Driver;

import DesignPatterns.FactoryPattern.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriverWithCapabilities implements Browser {
    private WebDriver driver;

    @Override
    public WebDriver initializeBrowser() {
        System.out.println("Initializing Chrome browser with capabilities");
        WebDriverManager.chromedriver().setup();

        //Create Chrome Options
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");
        System.out.println("Starting Chrome browser in headless mode");
        return new ChromeDriver(option);
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }


}
