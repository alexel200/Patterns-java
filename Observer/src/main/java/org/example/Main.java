package org.example;


import org.example.classes.Transmitter;
import org.example.classes.impl.AerialImpl;
import org.example.classes.impl.RadioImpl;
import org.example.classes.impl.TvImpl;

public class Main {
    public static void main(String[] args) {
        Transmitter transmitter = new Transmitter();
        AerialImpl aerial = new AerialImpl();
        RadioImpl radio = new RadioImpl();
        TvImpl tv = new TvImpl();
        transmitter.subscribeReceiver(aerial);
        transmitter.subscribeReceiver(radio);
        transmitter.subscribeReceiver(tv);
        transmitter.notifyReceivers();
    }
}