package com.shakhawat.isp;

/**
 * Interface Segregation Principle
 * <p>
 * A client should not be forced to implement an interface that it does not use.
 */

interface Animal {
    void eat();
    void fly();
    void swim();
}

class Dog implements Animal {

    @Override
    public void eat() {
        System.out.print("Dog is eating");
    }

    //Here, Dog is forced to implement fly(), which is not applicable.
    @Override
    public void fly() {
        //Not applicable for dog
    }

    @Override
    public void swim() {
        System.out.println("Dogs can swimming");
    }
}

public class BeforeISP {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.fly();// Here, Dog is forced to implement fly(), which is not applicable.
    }
}
