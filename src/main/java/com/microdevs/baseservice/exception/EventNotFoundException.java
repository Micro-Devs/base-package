package com.microdevs.baseservice.exception;

public class EventNotFoundException extends MicroException {
    public EventNotFoundException(String message, Integer errorCode, String messageDetail) {
        super(message, errorCode, messageDetail);
    }
}
