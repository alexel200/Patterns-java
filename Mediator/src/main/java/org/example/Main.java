package org.example;

public class Main {
    public static void main(String[] args) {

        Mediator mediator = new ConcreteMediator();

        CoWorker coWorker1 = new ConcreteCoworker1();
        CoWorker coWorker2 = new ConcreteCoworker2();
        CoWorker coWorker3 = new ConcreteCoworker3();

        mediator.register(coWorker1);
        mediator.register(coWorker2);
        mediator.register(coWorker3);

        coWorker1.sender();
        coWorker2.sender();
    }
}