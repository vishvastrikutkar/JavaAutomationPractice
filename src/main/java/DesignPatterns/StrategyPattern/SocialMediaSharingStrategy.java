package DesignPatterns.StrategyPattern;

public class SocialMediaSharingStrategy implements iPhotoSharing {
    @Override
    public void photoSharing() {
        System.out.println("Sharing photo on Social Media");
    }
}
