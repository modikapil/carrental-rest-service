package com.ws.rest.carrental;

import com.ws.rest.carrental.config.JerseyConfig;
import com.ws.rest.carrental.controller.CarRentalController;
import com.ws.rest.carrental.controller.CarRentalControllerImpl;
import com.ws.rest.carrental.service.CarRentalService;
import com.ws.rest.carrental.service.CarRentalServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class ApplicationFactory {

    @Bean
    public CarRentalService carRentalService() {
        return new CarRentalServiceImpl();
    }

    @Bean
    public CarRentalController carRentalController(CarRentalService carRentalService) {
        return new CarRentalControllerImpl(carRentalService);
    }

    @Bean
    public JerseyConfig jerseyConfig() {
        return new JerseyConfig();
    }
}
