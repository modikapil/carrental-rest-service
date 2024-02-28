package com.ws.rest.carrental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
public class CarRentalResponse {

    private List<Car> matchingCars;
}
