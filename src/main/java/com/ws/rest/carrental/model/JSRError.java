package com.ws.rest.carrental.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class JSRError {

    @NotNull
    @Size(min = 3, max = 3)
    private final String status;

    @NotNull
    @Size(max = 256)
    private final String message;

    public JSRError(@JsonProperty(value = "status") String status,
                    @JsonProperty(value = "message") String message) {
        this.status = status;
        this.message = message;
    }
}
