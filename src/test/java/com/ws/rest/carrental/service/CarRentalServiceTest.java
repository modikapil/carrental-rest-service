package com.ws.rest.carrental.service;

import com.ws.rest.carrental.model.Car;
import com.ws.rest.carrental.model.Criteria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarRentalServiceTest {

    private CarRentalService underTest;

    @BeforeEach
    public void setUp() {
        underTest = new CarRentalServiceImpl();
    }

    @Test
    public void testListCarsAvailableToRentGivesMoreThanOneCar() {
        Car car1 = new Car("VW", "Golf", "XX11 1UR", "B2", 90, "01-03-2024", "01-04-2024");
        Car car2 = new Car("VW", "Passat", "XX12 2UR",  "C1", 110,"15-03-2024", "15-04-2024");
        underTest.addCar(car1);
        underTest.addCar(car2);

        Criteria criteria = new Criteria("VW","02-03-2024","01-03-2024");
        List<Car> cars = underTest.matchingCars(criteria);
        assertEquals(1, cars.size());
        assertEquals("VW", cars.get(0).getMake());
        assertEquals("Golf", cars.get(0).getModel());
    }
}
