package DesignPatterns.Decorator;

//concrete widget decorators
public class VideoCallWidgetDecorator extends WidgetDecorator{

    private int videoWidgetRank = 15;
    public VideoCallWidgetDecorator(WebSitePage webSitePage) {
        super(webSitePage);
    }

    @Override
    public int getRank() {
        System.out.println("Video Widget Rank "+videoWidgetRank);
        return webSitePage.getRank()+videoWidgetRank;
    }
}
