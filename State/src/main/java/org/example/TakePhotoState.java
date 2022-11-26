package org.example;

public class TakePhotoState extends MobilePhoneState{
    public TakePhotoState(MobilePhone phone) {
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
        phone.changeState(new LockState(phone));
        return "the photo has been taken";
    }
}
