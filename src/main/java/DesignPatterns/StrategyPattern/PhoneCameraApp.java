package DesignPatterns.StrategyPattern;

public class PhoneCameraApp {

    private iPhotoSharing iPhotoSharing;
    private iPhotoEditor iPhotoEditor;

    public PhoneCameraApp(iPhotoSharing photoSharing,iPhotoEditor photoEditing)
    {
        this.iPhotoSharing = photoSharing;
        this.iPhotoEditor = photoEditing;
    }

    public void takePhoto()
    {
        System.out.println("Taking photo");
    }
    public void savePhoto()
    {
        System.out.println("Saving photo");
    }

    public void sharePhoto()
    {
        iPhotoSharing.photoSharing();
    }
    public void editPhoto()
    {
        iPhotoEditor.photoEditing();
    }


}
