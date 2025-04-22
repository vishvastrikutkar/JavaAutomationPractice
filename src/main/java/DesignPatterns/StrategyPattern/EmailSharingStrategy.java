package DesignPatterns.StrategyPattern;

public class EmailSharingStrategy implements iPhotoSharing {
    @Override
    public void photoSharing() {
        System.out.println("Sharing photo with Email");
    }
}
