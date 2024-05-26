package features.java17.sealedobject;

import java.awt.Color;

public sealed class Bike implements Vehicle permits Suzuki{

    @Override
    public void name(String name) {

    }

    @Override
    public void color(Color color) {

    }
}
