package com.ws.rest.carrental.controller;

import com.ws.rest.carrental.model.Car;
import com.ws.rest.carrental.model.CarRentalResponse;
import com.ws.rest.carrental.model.Criteria;
import com.ws.rest.carrental.service.CarRentalService;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CarRentalControllerTest {

    private Criteria criteria;

    @Mock
    private CarRentalService carRentalService;

    @InjectMocks
    private final CarRentalController underTest = new CarRentalControllerImpl(carRentalService);

    @BeforeEach
    public void setUp() {
        populateCriteria();
    }

    //@Test
    public void shouldBuildResponse() {
        buildMock();
        Response response = underTest.matchingCars(criteria);

        CarRentalResponse carRentalResponse = (CarRentalResponse) response
                .getEntity();

        Assertions.assertEquals(HttpStatus.SC_OK, response.getStatus());
        Assertions.assertEquals(1, carRentalResponse.getMatchingCars().size());
    }

    private void populateCriteria() {
        criteria = new Criteria("VW","02-03-2024","01-03-2024");
    }

    private void buildMock() {
        Car car1 = new Car("VW", "Golf", "XX11 1UR", "B2", 90, "01-03-2024", "01-04-2024");
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        when(carRentalService.matchingCars(criteria)).thenReturn(cars);
    }

}
