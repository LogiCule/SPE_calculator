package com.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

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
    void dummyTest() {
        assertTrue(true);
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
    void testNaturalLogInvalidInput() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.naturalLog(0);
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
}