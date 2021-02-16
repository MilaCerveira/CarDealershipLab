package dealership;

import people.Customer;
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

    public int getStockCount() {
        return this.carStock.size();
    }

    public void removeCar(Car car) {
        this.carStock.remove(car);
    }

    public double getTillAmount() {
        return this.till;
    }

    public void sellCar(Customer customer, Car car) {
        removeCar(car);
        customer.buyCar(car);
        this.till += car.getPrice();
    }

    public void buyCar(Car car) {
        this.carStock.add(car);
        this.till -= car.getPrice();
    }
}
