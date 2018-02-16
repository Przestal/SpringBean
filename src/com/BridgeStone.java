package com;

import com.interfaces.Wheel;

public class BridgeStone implements Wheel {
    @Override
    public void rotate() {
        System.out.println("BridgeStone" +
                " is the Wheel here");
    }
}
