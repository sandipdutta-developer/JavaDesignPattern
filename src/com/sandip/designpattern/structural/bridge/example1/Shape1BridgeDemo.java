package com.sandip.designpattern.structural.bridge.example1;

public class Shape1BridgeDemo {
    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();

        circle.applyColour();
        square.applyColour();
    }
}
