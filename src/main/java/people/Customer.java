package people;

import vehicle.Car;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Car> ownedCars;

    public Customer(String name, double wallet, ArrayList<Car> ownedCars){
        this.name = name;
        this.wallet = wallet;
        this.ownedCars = ownedCars;
    }
}
