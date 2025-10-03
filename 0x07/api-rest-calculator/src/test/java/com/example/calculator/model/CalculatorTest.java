package com.example.calculator.model;

import com.example.calculator.model.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void sumTest() {
        assertEquals(5.0, calc.sum(2.0, 3.0));
    }

    @Test
    void numbersNullSumTest() {
        assertThrows(NullPointerException.class, () -> calc.sum(null, 3.0));
    }

    @Test
    void subTest() {
        assertEquals(1.0, calc.sub(4.0, 3.0));
    }

    @Test
    void divideTest() {
        assertEquals(2.0, calc.divide(6.0, 3.0));
    }

    @Test
    void divisionByZeroTest() {
        assertThrows(ArithmeticException.class, () -> calc.divide(6.0, 0.0));
    }

    @Test
    void factorialTest() {
        assertEquals(120, calc.factorial(5));
    }

    @Test
    void integerToBinaryTest() {
        assertEquals(101, calc.integerToBinary(5));
    }

    @Test
    void integerToHexadecimalTest() {
        assertEquals("AA", calc.integerToHexadecimal(170));
    }

    @Test
    void calculeDayBetweenDateTest() {
        LocalDate d1 = LocalDate.of(2020, 3, 15);
        LocalDate d2 = LocalDate.of(2020, 3, 29);
        assertEquals(14, calc.calculeDayBetweenDate(d1, d2));
    }
}