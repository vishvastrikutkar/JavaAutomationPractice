package DesignPatterns;

import DesignPatterns.FactoryPattern.Browser;
import DesignPatterns.FactoryPattern.Factory.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class FactoryTest {

    public static WebDriver driver;
    public static void main(String[] args) {

        Browser chrome = BrowserFactory.getBrowser("CHROME");
        driver = chrome.initializeBrowser();
        driver.get("https://www.google.com");
        driver.quit();

        Browser edge = BrowserFactory.getBrowser("EDGE");
        driver = edge.initializeBrowser();
        driver.get("https://www.rediff.com");
        driver.quit();

        Browser firefox = BrowserFactory.getBrowser("FIREFOX");
        driver = firefox.initializeBrowser();
        driver.get("https://www.yahoo.com");
        driver.quit();

    }


}
