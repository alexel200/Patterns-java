package org.example;

public class ConcreteCoworker2 extends CoWorker{
    @Override
    void receiver() {
        System.out.println("Concrete CoWorker 2: receive");
    }

    @Override
    void sender() {
        System.out.println("CoWorker 2: sent");
        mediator.resend(this);
    }
}
