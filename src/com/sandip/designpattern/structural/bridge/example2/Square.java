package com.sandip.designpattern.structural.bridge.example2;

public class Square extends Shape {
    public Square(Colour colour) {
        super(colour);
    }

    @Override
    public void applyColour() {
        System.out.println("Applying colour " + super.colour + " on Square");
    }
}
