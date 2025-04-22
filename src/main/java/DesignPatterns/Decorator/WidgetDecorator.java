package DesignPatterns.Decorator;

//abstract decorator class
abstract public class WidgetDecorator implements WebSitePage{

    WebSitePage webSitePage;

    public WidgetDecorator(WebSitePage webSitePage)
    {
        this.webSitePage=webSitePage;
    }
}
