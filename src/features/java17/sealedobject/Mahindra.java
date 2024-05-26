package features.java17.sealedobject;

import java.awt.Color;

public class Mahindra extends Truck{

    @Override
    public void name(String name) {
        System.out.println("I am a mahindra truck and my name is " + name);
    }

    @Override
    public void color(Color color) {
        System.out.println("I am a mahindra truck and my color is " + color);
    }
}
