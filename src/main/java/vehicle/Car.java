package vehicle;

import components.*;


public class Car {
    public Engine engine;
    public Seat seats;
    public Door doors;
    public Tyres tyres;
    public VehicleType type;
    public ConditionLevel conditionLevel;

    public Car(Engine engine, Seat seats, Door doors, Tyres tyres, VehicleType type, ConditionLevel conditionLevel){
        this.engine = engine;
        this.seats = seats;
        this.doors = doors;
        this.tyres = tyres;
        this.type = type;
        this.conditionLevel = conditionLevel;
    }

    public String drive(){
        return "vroom!";
    }

}
