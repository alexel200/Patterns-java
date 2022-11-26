package org.example;

public class LaunchCameraState extends MobilePhoneState{
    public LaunchCameraState(MobilePhone phone) {
        super(phone);
    }

    @Override
    public String unlockPhone() {
        return "unlockPhone(): the phone was unlock;";
    }

    @Override
    public String launchCamera() {
        return "unlockPhone(): the camera was launched;";
    }

    @Override
    public String takePhoto() {
        phone.changeState(new TakePhotoState(phone));
        return "You are ready to take picture";
    }
}
