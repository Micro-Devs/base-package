package com.microdevs.baseservice.dto;

import java.util.Map;

public class ValidationErrorResponse {
    private Integer errorCode;
    private Map<String, String> validationErrors;
    private String message;
    private Long timestamp;

    public ValidationErrorResponse(Integer errorCode, Map<String, String> validationErrors, String message, Long timestamp) {
        this.errorCode = errorCode;
        this.validationErrors = validationErrors;
        this.message = message;
        this.timestamp = timestamp;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public Map<String, String> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(Map<String, String> validationErrors) {
        this.validationErrors = validationErrors;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
