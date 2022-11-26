package org.example.classes.impl;

import org.example.classes.NotifiedInterface;

public class RadioImpl implements NotifiedInterface {
    @Override
    public void notification() {
        System.out.println("Notificiation received in the Radio");
    }
}
