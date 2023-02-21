package com.ecomm.ecommlib.exception;

public class ECommException extends Exception{

    public ECommException(String message) {
        super(message);
    }

    public ECommException(String message, Throwable cause) {
        super(message, cause);
    }
}
