package com.microdevs.baseservice.dto;

public class ErrorResponse {
    private Integer errorCode;
    private String errorMessage;
    private String errorMessageDetail;
    private Boolean success;
    private Long timestamp;

    public ErrorResponse(Integer errorCode, String errorMessage, String errorMessageDetail, Boolean success, Long timestamp) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorMessageDetail = errorMessageDetail;
        this.success = success;
        this.timestamp = timestamp;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessageDetail() {
        return errorMessageDetail;
    }

    public void setErrorMessageDetail(String errorMessageDetail) {
        this.errorMessageDetail = errorMessageDetail;
    }


    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
