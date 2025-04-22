package DesignPatterns.FactoryPattern.Factory;

import DesignPatterns.FactoryPattern.Browser;
import DesignPatterns.FactoryPattern.Driver.MyChromeDriver;
import DesignPatterns.FactoryPattern.Driver.MyEdgeDriver;
import DesignPatterns.FactoryPattern.Driver.MyFirefoxDriver;

public class BrowserFactory {

    public static Browser getBrowser(String typeOfBrowser)
    {
        if(typeOfBrowser==null){
            return null;
        }
        return switch (typeOfBrowser.toUpperCase()) {
            case "CHROME" -> new MyChromeDriver();
            case "FIREFOX" -> new MyFirefoxDriver();
            case "EDGE" -> new MyEdgeDriver();
            default -> null;
        };
    }

}
