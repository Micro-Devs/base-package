package com.microdevs.baseservice.util;

public final class ExceptionMessageUtil {

    private ExceptionMessageUtil() {
        throw new AssertionError("Utility class cannot be instantiated");
    }

    public static final String ISE = "Internal Server Error";
    public static final String NPE = "Null Pointer Exception";
    public static final String BR = "Bad Request";
    public static final String VE = "Validation Error";
    public static final String DE = "Database Error";
    public static final String AD = "Access Denied";
    public static final String NF = "Not Found";
    public static final String IS = "Illegal State";
}
