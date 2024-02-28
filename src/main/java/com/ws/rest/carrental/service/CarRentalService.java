package com.ws.rest.carrental.service;

import com.ws.rest.carrental.model.Car;
import com.ws.rest.carrental.model.Criteria;

import java.util.List;

public interface CarRentalService {

    void addCar(Car car);

    List<Car> matchingCars(Criteria criteria);
}
