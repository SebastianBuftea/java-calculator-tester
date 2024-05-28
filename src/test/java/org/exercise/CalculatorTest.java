package org.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testadd() {
        assertEquals(3.44F, calculator.add(1.22F, 2.22F));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-2, calculator.add(-1, -1));
    }

    @Test
    void testsubstract() {
        assertEquals(5, calculator.substract(10.1F, 5.1F),0.1F);
        assertEquals(-2, calculator.substract(-1, 1));
        assertEquals(0, calculator.substract(-1, -1));
    }

    @Test
    void testdivide() {
        assertEquals(5, calculator.divide(10, 2));
        assertEquals(-1, calculator.divide(-1, 1));
        assertEquals(1, calculator.divide(-1, -1));
        assertEquals(5.25, calculator.divide(10.5F, 2F));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void testmultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-1, calculator.multiply(-1, 1));
        assertEquals(1, calculator.multiply(-1, -1));
        assertEquals(57.75, calculator.multiply(10.5F, 5.5F));
    }
}