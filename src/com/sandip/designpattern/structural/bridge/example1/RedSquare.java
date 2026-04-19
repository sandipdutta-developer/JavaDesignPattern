package com.sandip.designpattern.structural.bridge.example1;

public class RedSquare implements Square {
    @Override
    public void applyColour() {
        System.out.println("Applying colour on RedSquare");
    }
}
