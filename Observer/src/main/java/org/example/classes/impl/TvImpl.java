package org.example.classes.impl;

import org.example.classes.NotifiedInterface;

public class TvImpl implements NotifiedInterface {


    @Override
    public void notification() {
        System.out.println("Notificiation received on TV");
    }
}
