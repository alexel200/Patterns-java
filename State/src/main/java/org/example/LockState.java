package org.example;

public class LockState extends MobilePhoneState{

    public LockState(MobilePhone phone) {
        super(phone);
    }

    @Override
    public String unlockPhone() {
         phone.changeState( new UnlockState(phone) );
         return "unlockPhone(): The phone has been unlock successfully";
    }

    @Override
    public String launchCamera() {
        return "OpenCamera(): For launching the camera you must unlock the phone first";
    }

    @Override
    public String takePhoto() {
        return "You are not allowed to take picture while phone is lock";
    }
}
