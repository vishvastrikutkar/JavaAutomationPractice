package DesignPatterns.FactoryPattern;

import org.openqa.selenium.WebDriver;

public interface Browser {
    WebDriver initializeBrowser();
    WebDriver getDriver();


}
