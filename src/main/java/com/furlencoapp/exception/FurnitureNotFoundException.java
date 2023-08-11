package com.furlencoapp.exception;

public class FurnitureNotFoundException extends RuntimeException {
    public FurnitureNotFoundException(String message) {
        super(message);
    }
}
