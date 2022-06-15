package com.example.restcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sumTest() {
        // Arrange
        int a = 5;
        int b = 6;

        int expected = 11;

        // Act
        int result = calculator.sum(a,b);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    void divisionTest() {
        // Arrange
        int a = 6;
        int b = 3;

        int expected = 2;

        // Act
        int result = calculator.division(a,b);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    void multiplicationTest() {
        // Arrange
        int a = 2;
        int b = 4;

        int expected = 8;

        // Act
        int result = calculator.multiplication(a,b);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    void subTest() {
        // Arrange
        int a = 6;
        int b = 5;

        int expected = 1;

        // Act
        int result = calculator.sub(a,b);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    void expTest() {
        // Arrange
        int a = 5;
        int b = 2;

        double expected = 25;

        // Act
        double result = calculator.exp(a, b);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    void absolutTest() {
        // Arrange
        int a = -5;


        int expected = 5;

        // Act
        int result = calculator.absolut(a);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    void sqrtTest() {
        // Arrange
        int a = 25;

        int expected = 5;

        // Act
        double result = calculator.sqrt(a);

        // Assert
        assertEquals(expected, result);
    }

}