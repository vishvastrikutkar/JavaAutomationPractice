package DesignPatterns.Decorator;

//concrete widget decorators
public class SocialMediaWidgetDecorator extends WidgetDecorator{

    private int socialMediaWidgetRank = 10;
    public SocialMediaWidgetDecorator(WebSitePage webSitePage) {
        super(webSitePage);
    }

    @Override
    public int getRank() {
        System.out.println("SocialMedia Widget Rank "+socialMediaWidgetRank);
        return webSitePage.getRank()+ socialMediaWidgetRank;
    }
}
