package DesignPatterns.Decorator;

//concrete widget decorators
public class EmailWidgetDecorator extends WidgetDecorator{

    private int emailWidgetRank = 5;
    public EmailWidgetDecorator(WebSitePage webSitePage) {
        super(webSitePage);
    }

    @Override
    public int getRank() {
        System.out.println("Email Widget Rank "+emailWidgetRank);
        return webSitePage.getRank()+ emailWidgetRank;
    }
}
