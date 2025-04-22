package DesignPatterns.GOFFactoryPattern.Factory;

import DesignPatterns.FactoryPattern.Browser;
import DesignPatterns.GOFFactoryPattern.Driver.MyChromeDriver;

public class MyChromBrowserFactory extends BrowserFactory {
    @Override
    public Browser createBrowser() {
        return new MyChromeDriver();
    }
}
