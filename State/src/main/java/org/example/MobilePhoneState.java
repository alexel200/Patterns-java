package org.example;

abstract public class MobilePhoneState {
    public MobilePhone phone;

    public MobilePhoneState(MobilePhone phone){
        this.phone = phone;
    }

    abstract public  String unlockPhone();
    abstract public  String launchCamera();
    abstract  public String takePhoto();
}
