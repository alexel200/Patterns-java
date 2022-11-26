package org.example;

abstract public class CoWorker {
    Mediator mediator;
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    abstract void receiver();
    abstract void sender();
}
