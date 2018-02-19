package com;

import com.interfaces.Wheels;

public class BridgeStone implements Wheels {
    @Override
    public void rotate() {
        System.out.println("BridgeStone" +
                " is the Wheels here");
    }
}
