package DesignPatterns.GOFFactoryPattern.Factory;

import DesignPatterns.FactoryPattern.Browser;
import DesignPatterns.GOFFactoryPattern.Driver.MyEdgeDriver;

public class MyEdgeDriverFactory extends BrowserFactory {
    @Override
    public Browser createBrowser() {
        return new MyEdgeDriver();
    }
}
