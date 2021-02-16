import components.*;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicle.Car;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    Car car1;
    Car car2;
    Car car3;
    Customer customer;
    Engine engine;
    Engine engine2;
    Seat seats;
    Door doors;
    Tyres tyres;


    @Before
    public void before() {
        engine = new Engine("V8", 500, Transition.MANUAL);
        engine2 = new Engine("V6", 400, Transition.MANUAL);
        seats = new Seat("Leather", 4);
        doors = new Door(4);
        tyres = new Tyres(23);
        car1 = new Car(engine, seats, doors, tyres, VehicleType.PETROL, ConditionLevel.BRANDNEW, 25000.00);
        car2 = new Car(engine2, seats, doors, tyres, VehicleType.PETROL, ConditionLevel.BRANDNEW, 17000.00);
        car3 = new Car(engine2, seats, doors, tyres, VehicleType.PETROL, ConditionLevel.BRANDNEW, 18000.00);

        customer = new Customer("Mila", 30000.00);

        ArrayList<Car> dealershipStock = new ArrayList<Car>();
        dealershipStock.add(car1);
        dealershipStock.add(car2);

        dealership = new Dealership("Arnold Clark", 20000.00, dealershipStock);

    }

    @Test
    public void customerHasNoCar(){
        assertEquals(0, customer.getCarCount());
    }

    @Test
    public void customerCanAddCarToCollection(){
        customer.addCarToCollection(car1);
        assertEquals(1, customer.getCarCount());
    }

    @Test
    public void carHasPrice(){
        assertEquals(25000.00, car1.getPrice(), 0.01);
    }

    @Test
    public void customerHasWallet(){
        assertEquals(30000.00, customer.getWallet(), 0.01);
    }

    @Test
    public void customerCanBuyVehicle(){
        customer.buyCar(car1);
        assertEquals(1, customer.getCarCount());
        assertEquals(5000.00, customer.getWallet(), 0.01);
    }

    @Test
    public void canRemoveCar(){
        dealership.removeCar(car1);
        assertEquals(1, dealership.getStockCount());
    }

    @Test
    public void canSellVehicle(){
        dealership.sellCar(customer, car1);
        assertEquals(1, dealership.getStockCount());
        assertEquals(45000.00, dealership.getTillAmount(), 0.01);
        assertEquals(1, customer.getCarCount());
        assertEquals(5000.00, customer.getWallet(), 0.01);
    }

    @Test
    public void dealershipCanBuyVehicle(){
        dealership.buyCar(car3);
        assertEquals(3, dealership.getStockCount());
        assertEquals(2000.00, dealership.getTillAmount(), 0.01);


    }
}
