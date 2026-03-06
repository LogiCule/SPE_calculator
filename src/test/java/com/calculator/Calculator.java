package com.calculator;

public class Calculator {

    public static double squareRoot(double x) {

        if (x < 0) {
            throw new ArithmeticException("Square root of negative number not allowed");
        }

        return Math.sqrt(x);
    }

    public static double factorial(int x) {
        return 0;
    }

    public static double naturalLog(double x) {
        return 0;
    }

    public static double power(double x, double b) {
        return 0;
    }

}