package com.microdevs.baseservice.exception;

import com.microdevs.baseservice.dto.ErrorResponse;
import com.microdevs.baseservice.dto.ValidationErrorResponse;
import com.microdevs.baseservice.util.ExceptionCodeUtil;
import com.microdevs.baseservice.util.ExceptionMessageUtil;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.nio.file.AccessDeniedException;
import java.sql.SQLException;
import java.util.*;

@RestControllerAdvice("com.microdevs")
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleException(Exception ex) {
        return new ErrorResponse(ExceptionCodeUtil.ISE, ExceptionMessageUtil.ISE, ex.getLocalizedMessage(), false, System.currentTimeMillis());
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleNullPointerException(NullPointerException ex) {
        return new ErrorResponse(ExceptionCodeUtil.NPE, ExceptionMessageUtil.NPE, ex.getLocalizedMessage(), false, System.currentTimeMillis());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleIllegalArgumentException(IllegalArgumentException ex) {
        return new ErrorResponse(ExceptionCodeUtil.BR, ExceptionMessageUtil.BR, ex.getLocalizedMessage(), false, System.currentTimeMillis());
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleConstraintViolationException(ConstraintViolationException ex) {
        return new ErrorResponse(ExceptionCodeUtil.VE, ExceptionMessageUtil.VE, ex.getLocalizedMessage(), false, System.currentTimeMillis());
    }

    @ExceptionHandler(SQLException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleSQLException(SQLException ex) {
        return new ErrorResponse(ExceptionCodeUtil.DE, ExceptionMessageUtil.DE, ex.getLocalizedMessage(), false, System.currentTimeMillis());
    }

    @ExceptionHandler(AccessDeniedException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ErrorResponse handleAccessDeniedException(AccessDeniedException ex) {
        return new ErrorResponse(ExceptionCodeUtil.AD, ExceptionMessageUtil.AD, ex.getLocalizedMessage(), false, System.currentTimeMillis());
    }

    @ExceptionHandler(IllegalStateException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleIllegalStateException(IllegalStateException ex) {
        return new ErrorResponse(ExceptionCodeUtil.IS, ExceptionMessageUtil.IS, ex.getLocalizedMessage(), false, System.currentTimeMillis());
    }

    @ExceptionHandler(IndexOutOfBoundsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleIndexOutOfBoundsException(IndexOutOfBoundsException ex) {
        return new ErrorResponse(ExceptionCodeUtil.IBE, ExceptionMessageUtil.IBE, ex.getLocalizedMessage(), false, System.currentTimeMillis());
    }

    @ExceptionHandler(MicroException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleMicroException(MicroException exception) {
        Map<String, String> validationErrors = new HashMap<>();
        return new ErrorResponse(exception.getErrorCode(), exception.getMessage(), exception.getMessageDetail(), false, System.currentTimeMillis());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ValidationErrorResponse handleValidationException(MethodArgumentNotValidException exception) {
        Map<String, String> validationErrors = new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(fieldError ->
                validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage())
        );

        return new ValidationErrorResponse(ExceptionCodeUtil.NVE, validationErrors, ExceptionMessageUtil.VE, System.currentTimeMillis());
    }
}
