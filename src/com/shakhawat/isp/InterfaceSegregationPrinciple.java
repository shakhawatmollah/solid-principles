package com.shakhawat.isp;

/**
 * Interface Segregation Principle
 * <p>
 * Clients should not be forced to implement interfaces they do not use. Instead of one large interface, many small, specific interfaces are preferred.
 */

interface Eater {
    void eat();
}

interface Swimmer {
    void swim();
}

interface Flayer {
    void fly();
}

//Here the AnimalDog class only implements the interfaces that it actually needs.
class AnimalDog implements Eater, Swimmer{

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }
}

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        AnimalDog dog = new AnimalDog();
        dog.eat();
        dog.swim();
    }
}
