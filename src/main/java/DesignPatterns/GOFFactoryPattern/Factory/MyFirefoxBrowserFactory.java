package DesignPatterns.GOFFactoryPattern.Factory;

import DesignPatterns.FactoryPattern.Browser;
import DesignPatterns.GOFFactoryPattern.Driver.MyFirefoxDriver;

public class MyFirefoxBrowserFactory extends BrowserFactory {
    @Override
    public Browser createBrowser() {
        return new MyFirefoxDriver();
    }
}
