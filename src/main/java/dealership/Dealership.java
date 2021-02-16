package dealership;

import vehicle.Car;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private double till;
    private ArrayList<Car> carStock;

    public Dealership(String name, double till, ArrayList<Car> carStock){
        this.name = name;
        this.carStock = carStock;
        this.till = till;
    }
}
