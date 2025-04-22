package DesignPatterns.StrategyPattern;

public class TextSharingStrategy implements iPhotoSharing {
    @Override
    public void photoSharing() {
        System.out.println("Sharing photo using Text");
    }
}
