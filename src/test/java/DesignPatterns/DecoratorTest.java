package DesignPatterns;

import DesignPatterns.Decorator.*;

public class DecoratorTest {

    public static void main(String[] args) {
        WebSitePage newDesktopPage = new SocialMediaWidgetDecorator(new EmailWidgetDecorator(new DesktopPage()));
        System.out.println("Total Rank :"+newDesktopPage.getRank());
        System.out.println("------------------------------------------------------------------");

        newDesktopPage = new VideoCallWidgetDecorator(new SocialMediaWidgetDecorator(new DesktopPage()));
        System.out.println("Total Rank :"+newDesktopPage.getRank());
        System.out.println("------------------------------------------------------------------");

        WebSitePage newMobilePage = new SocialMediaWidgetDecorator(new EmailWidgetDecorator(new VideoCallWidgetDecorator(new MobilePage())));
        System.out.println("Total Rank :"+newMobilePage.getRank());
        System.out.println("------------------------------------------------------------------");

        newMobilePage = new MobilePage();
        System.out.println("Total Rank :"+newMobilePage.getRank());
    }
}
