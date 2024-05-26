package features.java17.sealedobject;


import java.awt.Color;

/**
 * Vehicle is a parent class which only permits Car and Truck to extend or implement it
 * In simple words, A Father only want his properties to be inherited by his own children not some cousins :D
 * Even if Cousin would want to steal some properties they can't
 * 3 Simple Rules for Sealed Classes:
 * 1. All permitted subclasses must belong to the same module or same package as the sealed class.
 * 2. Every permitted subclass must explicitly extend the sealed class as this is done by CAR and TRUCK
 * 3. Every permitted subclass must define a modifier: final, sealed, or non-sealed.
 * **/
public sealed abstract class VehicleClass permits Car {

    abstract void name(String name);
    abstract void color(Color color);
    abstract void state(String state);
}
