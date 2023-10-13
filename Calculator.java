package org.example.calculator;

import java.math.BigDecimal;

public class Calculator {

    public Calculator() {
    }

    public static <T extends Number> T sum(T a, T b) {
        return (T) new BigDecimal(a.toString()).add(new BigDecimal(b.toString()));
    }

    public static <T extends Number> T multiply(T a, T b) {
        return (T) new BigDecimal(a.toString()).multiply(new BigDecimal(b.toString()));
    }

    public static <T extends Number> T divide(T a, T b) {
        return (T) new BigDecimal(a.toString()).divide(new BigDecimal(b.toString()));
    }

    public static <T extends Number> T subtract(T a, T b) {
        return (T) new BigDecimal(a.toString()).subtract(new BigDecimal(b.toString()));
    }

    public static <T> boolean compareArrays(T[] a, T[] b) {
        if (a.length != b.length) {
            return false;
        } else return a.getClass().equals(b.getClass());
    }


}

