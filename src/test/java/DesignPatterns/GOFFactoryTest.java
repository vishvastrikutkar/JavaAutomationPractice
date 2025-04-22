package DesignPatterns;

import DesignPatterns.FactoryPattern.Browser;
import DesignPatterns.GOFFactoryPattern.Factory.*;
import org.openqa.selenium.WebDriver;

public class GOFFactoryTest {

    public static WebDriver driver;
    public static void main(String[] args) {

        BrowserFactory chromeBrowser = new MyChromBrowserFactory();
        Browser chrome = chromeBrowser.createBrowser();
        driver = chrome.initializeBrowser();
        driver.get("https://www.google.com");
        driver.quit();

        BrowserFactory edgeBrowser = new MyEdgeDriverFactory();
        Browser edge = edgeBrowser.createBrowser();
        driver = edge.initializeBrowser();
        driver.get("https://www.rediff.com");
        driver.quit();

        BrowserFactory firefoxBrowser = new MyFirefoxBrowserFactory();
        Browser firefox = firefoxBrowser.createBrowser();
        driver = firefox.initializeBrowser();
        driver.get("https://www.yahoo.com");
        driver.quit();

        BrowserFactory chromeBrowserHeadless = new MyChromBrowserCapabilitiesFactory();
        Browser chromeHeadless = chromeBrowserHeadless.createBrowser();
        driver = chromeHeadless.initializeBrowser();
        driver.get("https://www.google.com");
        driver.quit();

        BrowserFactory edgeBrowserHeadless = new MyEdgeDriverCapabilitiesFactory();
        Browser edgeHeadless = edgeBrowserHeadless.createBrowser();
        driver = edgeHeadless.initializeBrowser();
        driver.get("https://www.rediff.com");
        driver.quit();

        BrowserFactory fireFoxBrowserHeadless = new MyFirefoxBrowserCapabilitiesFactory();
        Browser fireFoxHeadless = fireFoxBrowserHeadless.createBrowser();
        driver = fireFoxHeadless.initializeBrowser();
        driver.get("https://www.yahoo.com");
        driver.quit();
    }

}
