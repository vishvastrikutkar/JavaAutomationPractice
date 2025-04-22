package DesignPatterns.StrategyPattern;

public class BasicPhotoEditingStrategy implements iPhotoEditor{
    @Override
    public void photoEditing() {
        System.out.println("Basic Photo edit");
    }
}
