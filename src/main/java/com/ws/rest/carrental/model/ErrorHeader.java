package com.ws.rest.carrental.model;

import java.util.ArrayList;
import java.util.List;

public class ErrorHeader {

    private List<JSRError> errors;

    public List<JSRError> getErrors() {
        if(errors != null) {
            return errors;
        }
        return errors = new ArrayList<>();
    }
}
