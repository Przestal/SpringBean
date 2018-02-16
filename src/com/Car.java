package com;

import com.interfaces.Wheel;

public class Car {

    private Wheel wheel;

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void move(){
        System.out.println("CARS MOVING");
        this.getWheel().rotate();
    }
}
