package com.ws.rest.carrental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.ws.rs.PathParam;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
public class Criteria {

    @NotNull
    @PathParam("carMake")
    private String carMake;

    @NotNull
    @PathParam("pickUpDate")
    private String pickUpDate;

    @NotNull
    @PathParam("dropOffDate")
    private String dropOffDate;
}
