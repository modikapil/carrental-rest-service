package com.ws.rest.carrental.service;

import com.ws.rest.carrental.model.Car;
import com.ws.rest.carrental.model.Criteria;
import com.ws.rest.carrental.utils.DatePeriodUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarRentalServiceImpl implements CarRentalService {

    private final List<Car> cars = new ArrayList<>();

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> matchingCars(Criteria criteria) {
        return cars.stream()
                .filter(p -> p.getMake().equals(criteria.getCarMake()))
                .filter(d -> DatePeriodUtils.isInPeriod(DatePeriodUtils.getLocalDate(criteria.getPickUpDate()),
                        DatePeriodUtils.getDatePeriod(d.getAvailableFrom(), d.getAvailableTo())))
                .collect(Collectors.toList());
    }

}
