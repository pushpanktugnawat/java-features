package features.java17.sealedobject;

import java.awt.Color;

public class MainClassToDemonstrate {

    public static void main(String[] args) {

        /***/
        Truck mahindra = new Mahindra();
        mahindra.name("VAYU");
        mahindra.color(Color.BLACK);

        Truck truck = new Truck();
        truck.name("MANz");
        truck.color(Color.BLACK);

        Car car = new Car();
        car.name("Audi 800");
        car.color(Color.BLUE);

        VehicleClass vehicle = new Car();
        vehicle.name("mini cooper");
        vehicle.color(Color.GRAY);
        vehicle.state("I am healthy");
    }
}
