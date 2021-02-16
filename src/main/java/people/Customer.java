package people;

import vehicle.Car;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Car> ownedCars;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.ownedCars = new ArrayList<Car>();
    }

    public int getCarCount() {
        return this.ownedCars.size();
    }

    public void addCarToCollection(Car car) {
        this.ownedCars.add(car);
    }

    public double getWallet() {
        return wallet;
    }

    public void buyCar(Car car) {
        this.addCarToCollection(car);
        this.wallet -= car.getPrice();
    }
}
