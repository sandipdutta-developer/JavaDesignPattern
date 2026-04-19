package com.sandip.designpattern.structural.bridge.example1;

public class BlueCircle implements Circle {

    @Override
    public void applyColour() {
        System.out.println("Applying blue colour on BlueCircle");
    }
}
