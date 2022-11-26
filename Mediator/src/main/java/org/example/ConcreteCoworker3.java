package org.example;

public class ConcreteCoworker3 extends CoWorker{
    @Override
    void receiver() {
        System.out.println("Concrete CoWorker 3: receive");
    }

    @Override
    void sender() {
        System.out.println("CoWorker 3: sent");
        mediator.resend(this);
    }
}
