package com.microdevs.baseservice.util;

public final class ExceptionCodeUtil {

    private ExceptionCodeUtil() {
        throw new AssertionError("Utility class cannot be instantiated");
    }


    public static final Integer ISE = 1000;
    public static final Integer NPE = 1001;
    public static final Integer BR = 1002;
    public static final Integer VE = 1003;
    public static final Integer DE = 1004;
    public static final Integer AD = 1005;
    public static final Integer NF = 1006;
    public static final Integer IS = 1007;
    public static final Integer NVE = 1008;
    public static final Integer IBE = 1009;
    public static final Integer ME = 1010;
}
