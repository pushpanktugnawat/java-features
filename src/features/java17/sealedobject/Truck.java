package features.java17.sealedobject;

import java.awt.Color;

/**
 * So TRUCK is a non-sealed class that means it can be extendeed by any other class
 * check : Mahindra.java for example
 * **/
public non-sealed class Truck implements Vehicle {

    @Override
    public void name(String name) {
        System.out.println("I am a truck and my name is " + name);
    }

    @Override
    public void color(Color color) {
        System.out.println("I am a truck and my color is " + color);
    }
}
