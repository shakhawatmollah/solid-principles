package com.shakhawat.lsp;


/**
 * Liskov Substitution Principle
 * <p>
 * Objects of a base class should be replaceable with objects of its subclasses without breaking the application.
 */


class Bird {
    public void fly() {
        System.out.println("Bird can fly");
    }
}

class Eagle extends Bird {
    public void fly() {
        System.out.println("Eagles can fly");
    }
}

/**
 * This violates LSP because Penguin is a Bird, but we cannot substitute it in place of Bird without causing problems.
 */
class Penguin extends Bird {
    public void fly() {
        System.out.println("Penguins can't fly");
    }
}

public class BeforeLSP {

    public static void main(String[] args) {

        Bird penguin = new Penguin();
        penguin.fly();

        Bird eagle = new Eagle();
        eagle.fly();
    }
}
