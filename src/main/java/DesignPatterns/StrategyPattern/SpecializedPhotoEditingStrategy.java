package DesignPatterns.StrategyPattern;

public class SpecializedPhotoEditingStrategy implements iPhotoEditor{
    @Override
    public void photoEditing() {
        System.out.println("Advanced Photo edit");
    }
}
