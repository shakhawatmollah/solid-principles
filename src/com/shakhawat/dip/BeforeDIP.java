package com.shakhawat.dip;

/**
 * Dependency Inversion Principle
 * <p>
 * High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g., interfaces).
 * Abstractions should not depend on details, but details should depend on abstractions.
 */

class LightBulb{

    public void turnOn(){
        System.out.println("LightBulb turned on");
    }

    public void turnOff(){
        System.out.println("LightBulb turned off");
    }
}

class Switch{

    private final LightBulb lightBulb;

    public Switch(LightBulb lightBulb){
        this.lightBulb = lightBulb;
    }

    public void operate(String command){
        if(command.equalsIgnoreCase("ON")){
            lightBulb.turnOn();
        }else if(command.equalsIgnoreCase("OFF")){
            lightBulb.turnOff();
        }
    }

}

public class BeforeDIP {

    public static void main(String[] args) {
        Switch switch1 = new Switch(new LightBulb());
        switch1.operate("ON");
        switch1.operate("OFF");
    }
}
