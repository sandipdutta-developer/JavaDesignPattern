package com.sandip.designpattern.structural.bridge.example2;

public class Red implements Colour {

    @Override
    public void applyColour() {
        System.out.println("Applying red colour");
    }

    @Override
    public String toString() {
        String colourCode = "Red";
        return "Red{" +
                "colourCode='" + colourCode + '\'' +
                '}';
    }
}
