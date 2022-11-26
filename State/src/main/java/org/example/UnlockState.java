package org.example;

public class UnlockState extends MobilePhoneState{
    public UnlockState(MobilePhone phone) {
        super(phone);
    }

    @Override
    public String unlockPhone() {
        return "unlockPhone(): the phone was unlock;";
    }

    @Override
    public String launchCamera() {
        phone.changeState(new LaunchCameraState(phone));
        return "Launching camera";
    }

    @Override
    public String takePhoto() {
        return "takePhoto(): Can not take picture without launching the camera";
    }
}
