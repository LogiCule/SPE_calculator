package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    // -------- Square Root Tests --------

    @Test
    void testSquareRootPerfectSquare() {
        assertEquals(4.0, Calculator.squareRoot(16), 0.0001);
    }

    @Test
    void testSquareRootDecimal() {
        assertEquals(3.0, Calculator.squareRoot(9), 0.0001);
    }

    @Test
    void testSquareRootZero() {
        assertEquals(0.0, Calculator.squareRoot(0), 0.0001);
    }

    @Test
    void testSquareRootNegativeNumber() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.squareRoot(-4);
        });
    }

    @Test
    void testSquareRootLargeNumber() {
        assertEquals(10000.0, Calculator.squareRoot(100000000), 0.0001);
    }

    @Test
    void testSquareRootSmallNumber() {
        assertEquals(0.5, Calculator.squareRoot(0.25), 0.0001);
    }


    // -------- Factorial Tests --------

    @Test
    void testFactorialFive() {
        assertEquals(120L, Calculator.factorial(5));
    }

    @Test
    void testFactorialOne() {
        assertEquals(1L, Calculator.factorial(1));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1L, Calculator.factorial(0));
    }

    @Test
    void testFactorialTen() {
        assertEquals(3628800L, Calculator.factorial(10));
    }

    @Test
    void testFactorialNegativeNumber() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.factorial(-3);
        });
    }


    // -------- Natural Log Tests --------

    @Test
    void testNaturalLogOne() {
        assertEquals(0.0, Calculator.naturalLog(1), 0.0001);
    }

    @Test
    void testNaturalLogE() {
        assertEquals(1.0, Calculator.naturalLog(Math.E), 0.0001);
    }

    @Test
    void testNaturalLogInvalidInputZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.naturalLog(0);
        });
    }

    @Test
    void testNaturalLogNegativeInput() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.naturalLog(-5);
        });
    }


    // -------- Power Tests --------

    @Test
    void testPowerPositiveExponent() {
        assertEquals(8.0, Calculator.power(2,3), 0.0001);
    }

    @Test
    void testPowerZeroExponent() {
        assertEquals(1.0, Calculator.power(5,0), 0.0001);
    }

    @Test
    void testPowerNegativeExponent() {
        assertEquals(0.25, Calculator.power(2,-2), 0.0001);
    }

    @Test
    void testPowerZeroBase() {
        assertEquals(0.0, Calculator.power(0,5), 0.0001);
    }

    @Test
    void testPowerFractionExponent() {
        assertEquals(3.0, Calculator.power(9,0.5), 0.0001);
    }

/*
    @Test
    void testIntentionalFailure() {
        assertEquals(5.0, Calculator.squareRoot(16), 0.0001);
    }
*/

}