import components.*;
import org.junit.Before;
import org.junit.Test;
import vehicle.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Seat seats;
    Door doors;
    Tyres tyres;


    @Before
    public void before(){
        engine = new Engine("V8", 500, Transition.MANUAL);
        seats = new Seat("Leather", 4);
        doors = new Door(4);
        tyres = new Tyres(23);
        car = new Car(engine, seats, doors, tyres, VehicleType.PETROL, ConditionLevel.BRANDNEW, 25000.00);
    }

    @Test
    public void canDrive(){
        assertEquals("vroom!", car.drive());
    }



}
