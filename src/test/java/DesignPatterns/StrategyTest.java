package DesignPatterns;

import DesignPatterns.StrategyPattern.*;

public class StrategyTest {

    public static void main(String[] args) {

        PhoneCameraApp basicCameraApp = new PhoneCameraApp(new EmailSharingStrategy(),new BasicPhotoEditingStrategy());

        basicCameraApp.takePhoto();
        basicCameraApp.editPhoto();
        basicCameraApp.savePhoto();
        basicCameraApp.sharePhoto();

        PhoneCameraApp basicCameraApp1 = new PhoneCameraApp(new TwitterSharingStrategy(),new BasicPhotoEditingStrategy());

        basicCameraApp1.takePhoto();
        basicCameraApp1.editPhoto();
        basicCameraApp1.savePhoto();
        basicCameraApp1.sharePhoto();

        PhoneCameraApp cameraPlusApp = new PhoneCameraApp(new TextSharingStrategy(),new SpecializedPhotoEditingStrategy());

        cameraPlusApp.takePhoto();
        cameraPlusApp.editPhoto();
        cameraPlusApp.savePhoto();
        cameraPlusApp.sharePhoto();

        cameraPlusApp = new PhoneCameraApp(new SocialMediaSharingStrategy(),new SpecializedPhotoEditingStrategy());

        cameraPlusApp.takePhoto();
        cameraPlusApp.editPhoto();
        cameraPlusApp.savePhoto();
        cameraPlusApp.sharePhoto();

    }


}
