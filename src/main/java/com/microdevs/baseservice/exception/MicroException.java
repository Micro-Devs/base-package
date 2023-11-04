package com.microdevs.baseservice.exception;

public class MicroException extends RuntimeException {
    private Integer errorCode;
    private String messageDetail;
    private Boolean success;
    private Long timestamp;

    public MicroException(String message, Integer errorCode, String messageDetail) {
        super(message);
        this.errorCode = errorCode;
        this.messageDetail = messageDetail;
        this.success = false;
        this.timestamp = System.currentTimeMillis();
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessageDetail() {
        return messageDetail;
    }

    public void setMessageDetail(String messageDetail) {
        this.messageDetail = messageDetail;
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
