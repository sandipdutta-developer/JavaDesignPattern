package com.sandip.designpattern.structural.bridge.example2;

public class ShapeColourBridgeDemo {
    public static void main(String[] args) {
        Colour red = new Red();
        Colour blue = new Blue();

        Shape circle = new Circle(blue);
        Shape square = new Square(red);

        circle.applyColour();
        new Circle(red).applyColour();
        square.applyColour();
        new Square(blue).applyColour();
    }
}
