package org.example.classes;


import java.util.ArrayList;
import java.util.List;

public class Transmitter {
    List<NotifiedInterface> receivers = new ArrayList();

    public void subscribeReceiver(NotifiedInterface receiver){
        receivers.add(receiver);
    }

    public void notifyReceivers(){
        for(NotifiedInterface receiver : receivers ){
            receiver.notification();
        }
    }
}
