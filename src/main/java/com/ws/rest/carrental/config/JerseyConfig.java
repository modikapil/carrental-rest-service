package com.ws.rest.carrental.config;

import com.ws.rest.carrental.controller.CarRentalControllerImpl;
import com.ws.rest.carrental.mapper.JSRConstraintViolationExceptionMapper;
import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(CarRentalControllerImpl.class);
        register(JSRConstraintViolationExceptionMapper.class);
    }

}
