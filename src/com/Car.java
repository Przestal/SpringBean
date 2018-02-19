package com;

import com.interfaces.Wheels;
import domain.java.Wheel;

public class Car {

    private Wheels wheels;
    private String name;
    private Wheel wheel;

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public void move(){
        System.out.println("CARS MOVING");
        this.getWheels().rotate();
    }

    public Wheel getWheel() {
        return wheel;
    }
}
