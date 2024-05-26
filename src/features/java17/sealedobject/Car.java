package features.java17.sealedobject;

import java.awt.Color;

public final class Car extends VehicleClass implements Vehicle {

    @Override
    public void name(String name) {
        System.out.println("I am a car and my name is " + name);
    }

    @Override
    public void color(Color color) {
        System.out.println("I am a car and my color is " + color);
    }

    @Override
    void state(String state) {
        System.out.println("I am a car and my state is " + state);
    }


}
