package DesignPatterns.GOFFactoryPattern.Factory;

import DesignPatterns.FactoryPattern.Browser;
import DesignPatterns.GOFFactoryPattern.Driver.MyChromeDriverWithCapabilities;

public class MyChromBrowserCapabilitiesFactory extends BrowserFactory {
    @Override
    public Browser createBrowser() {
        return new MyChromeDriverWithCapabilities();
    }
}
