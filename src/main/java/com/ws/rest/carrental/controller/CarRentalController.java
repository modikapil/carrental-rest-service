package com.ws.rest.carrental.controller;

import com.ws.rest.carrental.model.Criteria;

import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/")
public interface CarRentalController {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/carrental/addCars")
    Response addCars();

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/carrental/availableCars/{carMake}/{pickUpDate}/{dropOffDate}")
    Response matchingCars(@Valid @BeanParam Criteria criteria);
}
