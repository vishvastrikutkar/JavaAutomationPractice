package DesignPatterns.StrategyPattern;

public class TwitterSharingStrategy implements iPhotoSharing {
    @Override
    public void photoSharing() {
        System.out.println("Sharing photo with Twitter");
    }
}
