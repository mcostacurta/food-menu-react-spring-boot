package com.menu.menu;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceInvalidException extends RuntimeException {
    public ResourceInvalidException(String message) {
        super(message);
    }
}