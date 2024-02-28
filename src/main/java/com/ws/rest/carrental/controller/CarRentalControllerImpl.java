package com.ws.rest.carrental.controller;

import com.ws.rest.carrental.model.Car;
import com.ws.rest.carrental.model.CarRentalResponse;
import com.ws.rest.carrental.model.Criteria;
import com.ws.rest.carrental.service.CarRentalService;
import org.apache.http.HttpStatus;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class CarRentalControllerImpl implements CarRentalController {

    private final CarRentalService carRentalService;

    public CarRentalControllerImpl(CarRentalService carRentalService) {
        this.carRentalService = carRentalService;
    }

    @Override
    public Response addCars() {
        Car car1 = new Car("VW", "Golf", "XX11 1UR", "B2", 90, "01-03-2024", "01-04-2024");
        Car car2 = new Car("VW", "Passat", "XX12 2UR",  "C1", 110,"15-03-2024", "15-04-2024");
        this.carRentalService.addCar(car1);
        this.carRentalService.addCar(car2);
        return Response
                .status(HttpStatus.SC_OK)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }

    @Override
    public Response matchingCars(Criteria criteria) {
        CarRentalResponse carRentalResponse = new CarRentalResponse(this.carRentalService.matchingCars(criteria));
        return buildControllerResponse(carRentalResponse);
    }

    private Response buildControllerResponse(CarRentalResponse carRentalResponse) {
        return Response
                .status(HttpStatus.SC_OK)
                .entity(carRentalResponse)
                .type(MediaType.APPLICATION_JSON)
                .build();
    }

}
