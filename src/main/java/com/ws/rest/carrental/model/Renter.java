package com.ws.rest.carrental.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@RequiredArgsConstructor
@Getter
public class Renter {

    @NotNull
    private final String lastName;

    @NotNull
    private final String firstName;

    @NotNull
    private final String drivingLicenseNumber;

    @NotNull
    private final LocalDate dateOfBirth;
}
