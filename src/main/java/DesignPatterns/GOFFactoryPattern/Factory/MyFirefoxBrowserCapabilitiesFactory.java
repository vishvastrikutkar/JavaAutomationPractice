package DesignPatterns.GOFFactoryPattern.Factory;

import DesignPatterns.FactoryPattern.Browser;
import DesignPatterns.GOFFactoryPattern.Driver.MyFirefoxDriverWithCapabilities;

public class MyFirefoxBrowserCapabilitiesFactory extends BrowserFactory {
    @Override
    public Browser createBrowser() {
        return new MyFirefoxDriverWithCapabilities();
    }
}
