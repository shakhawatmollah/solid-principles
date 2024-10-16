package com.shakhawat.lsp;

/**
 * Liskov Substitution Principle
 * <p>
 * Objects of a base class should be replaceable with objects of its subclasses without breaking the application.
 */

abstract class AnimalBird {
    public abstract void move();
}

class Sparrow extends AnimalBird {
    @Override
    public void move() {
        System.out.println("Sparrows can fly");
    }
}

class AnimalPenguin extends AnimalBird {
    @Override
    public void move() {
        System.out.println("Penguins can swimming");
    }
}

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        AnimalBird sparrow = new Sparrow();
        sparrow.move();
        AnimalBird penguin = new AnimalPenguin();
        penguin.move();
    }
}
