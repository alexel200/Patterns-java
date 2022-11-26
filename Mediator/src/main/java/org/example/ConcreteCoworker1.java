package org.example;

public class ConcreteCoworker1 extends CoWorker{
    @Override
    void receiver() {
        System.out.println("Concrete CoWorker 1: receive");
    }

    @Override
    void sender() {
        System.out.println("CoWorker 1: sent 1");
        mediator.resend(this);
    }
}
