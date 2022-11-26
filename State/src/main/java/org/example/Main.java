package org.example;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        System.out.println(phone.state.unlockPhone());
        System.out.println(phone.state.launchCamera());
        System.out.println(phone.state.takePhoto());
        System.out.println(phone.state.takePhoto());
    }
}