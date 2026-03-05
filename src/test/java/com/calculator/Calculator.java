package com.calculator;

public class Calculator {

    public static double squareRoot(double x) {

        if (x < 0) {
            throw new ArithmeticException("Square root of negative number not allowed");
        }

        return Math.sqrt(x);
    }

}