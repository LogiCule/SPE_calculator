package com.calculator;

public class Calculator {

    public static double squareRoot(double x) {

        if (x < 0) {
            throw new ArithmeticException("Square root of negative number not allowed");
        }

        return Math.sqrt(x);
    }


    public static long factorial(long n) {

        if (n < 0) {
            throw new ArithmeticException("Factorial of negative number not allowed");
        }

        long MOD = 1000000007L;
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = (result * i) % MOD;
        }

        return result;
    }

    public static double naturalLog(double x) {

        if (x <= 0) {
            throw new ArithmeticException("Natural log undefined for non-positive numbers");
        }

        return Math.log(x);
    }

    public static double power(double x, double b) {
        return 0;
    }

}