package com.microdevs.baseservice.exception;

public class UserNotFoundException extends MicroException {
    public UserNotFoundException(String message, Integer errorCode, String messageDetail) {
        super(message, errorCode, messageDetail);
    }
}
