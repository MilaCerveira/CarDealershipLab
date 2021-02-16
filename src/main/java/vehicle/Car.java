package vehicle;

import components.*;

import java.util.concurrent.locks.Condition;


public class Car {
    private Engine engine;
    private Seat seats;
    private Door doors;
    private Tyres tyres;
    private VehicleType type;
    private ConditionLevel conditionLevel;
    private double price;

    public Car(Engine engine, Seat seats, Door doors, Tyres tyres, VehicleType type, ConditionLevel conditionLevel, double price){
        this.engine = engine;
        this.seats = seats;
        this.doors = doors;
        this.tyres = tyres;
        this.type = type;
        this.conditionLevel = conditionLevel;
        this.price = price;
    }

    public String drive(){
        return "vroom!";
    }

    public double getPrice() {
        return this.price;
    }

    public ConditionLevel getCondition() {
        return this.conditionLevel;
    }

    public void damageAdded(ConditionLevel conditionLevel){
        this.conditionLevel = conditionLevel;
    }
}
