package com.hidenari;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelperCustomTest {
    private final HelperCustom helper = new HelperCustom();

    @Test
    @DisplayName("fizzBuzz function int pattern")
    public void fizzBuzzFunctionIntTest() {
        assertEquals("1", helper.fizzBuzz(1));
        assertEquals("2", helper.fizzBuzz(2));
        assertEquals("fizz", helper.fizzBuzz(3));
        assertEquals("4", helper.fizzBuzz(4));
        assertEquals("buzz", helper.fizzBuzz(5));
        assertEquals("fizzbuzz", helper.fizzBuzz(15));
        assertEquals("FIZZBUZZ", helper.fizzBuzz(30));
    }

    @Test
    @DisplayName("fizzBuzz function string pattern")
    public void fizzBuzzFunctionStringTest() {
        assertEquals("1", helper.fizzBuzz("1"));
        assertEquals("2", helper.fizzBuzz("2"));
        assertEquals("fizz", helper.fizzBuzz("3"));
        assertEquals("4", helper.fizzBuzz("4"));
        assertEquals("buzz", helper.fizzBuzz("5"));
        assertEquals("fizzbuzz", helper.fizzBuzz("15"));
        assertEquals("FIZZBUZZ", helper.fizzBuzz("30"));
    }

    @Test
    @DisplayName("fizzBuzz function double pattern")
    public void fizzBuzzFunctionDoubleTest() {
        assertEquals("1", helper.fizzBuzz(1.0));
        assertEquals("1", helper.fizzBuzz(1.1));
        assertEquals("2", helper.fizzBuzz(2.0));
        assertEquals("2", helper.fizzBuzz(2.1));
        assertEquals("fizz", helper.fizzBuzz(3.0));
        assertEquals("fizz", helper.fizzBuzz(3.1));
        assertEquals("4", helper.fizzBuzz(4.0));
        assertEquals("4", helper.fizzBuzz(4.1));
        assertEquals("buzz", helper.fizzBuzz(5.0));
        assertEquals("buzz", helper.fizzBuzz(5.1));
        assertEquals("fizzbuzz", helper.fizzBuzz(15.0));
        assertEquals("fizzbuzz", helper.fizzBuzz(15.1));
        assertEquals("FIZZBUZZ", helper.fizzBuzz(30.0));
        assertEquals("FIZZBUZZ", helper.fizzBuzz(30.1));
    }

    @Test
    @DisplayName("fizzBuzz function boolean true pattern")
    public void fizzBuzzFunctionBooleanTest() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> {
                    helper.fizzBuzz(true);
                });
        assertEquals("boolean input invalid", exception.getMessage());
    }

    @Test
    @DisplayName("fizzBuzz function boolean false pattern")
    public void fizzBuzzFunctionBooleanFalseTest() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> {
                    helper.fizzBuzz(false);
                });
        assertEquals("boolean input invalid", exception.getMessage());
    }

    @Test
    @DisplayName("fizzBuzz function str pattern with error")
    public void fizzBuzzFunctionStringWithErrorTest() {
        assertThrows(NumberFormatException.class, () -> {
            helper.fizzBuzz("1st");
        });
        assertThrows(NumberFormatException.class, () -> {
            helper.fizzBuzz("str");
        });
    }
}