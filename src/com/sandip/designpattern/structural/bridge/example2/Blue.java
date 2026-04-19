package com.sandip.designpattern.structural.bridge.example2;

public class Blue implements Colour {

    @Override
    public String toString() {
        String colourCode = "Blue";
        return "Blue{" +
                "colourCode='" + colourCode + '\'' +
                '}';
    }

    @Override
    public void applyColour() {
        System.out.println("Applying blue colour");
    }
}
