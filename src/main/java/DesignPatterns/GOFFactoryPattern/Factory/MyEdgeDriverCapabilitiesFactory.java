package DesignPatterns.GOFFactoryPattern.Factory;

import DesignPatterns.FactoryPattern.Browser;
import DesignPatterns.GOFFactoryPattern.Driver.MyEdgeDriverWithCapabilities;

public class MyEdgeDriverCapabilitiesFactory extends BrowserFactory {
    @Override
    public Browser createBrowser() {
        return new MyEdgeDriverWithCapabilities();
    }
}
