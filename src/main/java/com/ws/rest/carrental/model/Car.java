package com.ws.rest.carrental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
public class Car {

    @NotNull
    private final String make;

    @NotNull
    private final String model;

    @NotNull
    private final String registrationNumber;

    @NotNull
    private String rentalGroup;

    @NotNull
    private double costPerDay;

    @NotNull
    private String availableFrom;

    @NotNull
    private String availableTo;
}
