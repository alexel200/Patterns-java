package org.example;

public class MobilePhone {
    public MobilePhoneState state;

    public MobilePhone(){
        this.state = new LockState(this);
    }

    public void changeState(MobilePhoneState state){
        System.out.println("Last state" + this.state.getClass().getName() );
        this.state = state;
        System.out.println("New State" + this.state.getClass().getName());
    }

    public MobilePhoneState getState(){
        return this.state;
    }
}
