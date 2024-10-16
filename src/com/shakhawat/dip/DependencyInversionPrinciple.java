package com.shakhawat.dip;

/**
 * Dependency Inversion Principle
 * <p>
 * High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g., interfaces).
 * Abstractions should not depend on details, but details should depend on abstractions.
 */

interface Switchable {
    void turnOn();
    void turnOff();
}

class LEDLightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb turned on");
    }
    public void turnOff() {
        System.out.println("LightBulb turned off");
    }
}

class BulbSwitch {
    private final Switchable lightBulb;
    public BulbSwitch(Switchable lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void operate(String command) {
        if(command.equalsIgnoreCase("ON")) {
            lightBulb.turnOn();
        } else if(command.equalsIgnoreCase("OFF")) {
            lightBulb.turnOff();
        }
    }
}


public class DependencyInversionPrinciple {

    public static void main(String[] args) {
        Switchable lightBulb = new LEDLightBulb();
        BulbSwitch bulbSwitch = new BulbSwitch(lightBulb);
        bulbSwitch.operate("ON");
        bulbSwitch.operate("OFF");
    }

}
