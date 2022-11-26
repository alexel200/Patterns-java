package org.example;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator{
    List<CoWorker> coWorkers = new ArrayList<CoWorker>();
    @Override
    void register(CoWorker coWorker) {
        if(!coWorkers.contains(coWorker)){
            coWorkers.add(coWorker);
            coWorker.setMediator(this);
        }
    }

    @Override
    void resend(CoWorker coWorker) {
        for(CoWorker current : coWorkers){
            if(!current.equals(coWorker)){
                current.receiver();
            }
        }
    }
}
