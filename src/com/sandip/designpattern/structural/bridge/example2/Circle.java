package com.sandip.designpattern.structural.bridge.example2;

public class Circle extends Shape {
    public Circle(Colour colour) {
        super(colour);
    }

    @Override
    public void applyColour() {
        System.out.println("Applying colour " + super.colour + " on Circle");
    }
}
