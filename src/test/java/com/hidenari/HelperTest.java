package com.hidenari;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelperTest {

    @Test
    @DisplayName("fizzBuzz function int pattern")
    public void fizzBuzzFunctionIntTest() {
        assertEquals("1", Helper.fizzBuzz(1));
        assertEquals("2", Helper.fizzBuzz(2));
        assertEquals("fizz", Helper.fizzBuzz(3));
        assertEquals("4", Helper.fizzBuzz(4));
        assertEquals("buzz", Helper.fizzBuzz(5));
        assertEquals("fizzbuzz", Helper.fizzBuzz(15));
    }

    @Test
    @DisplayName("fizzBuzz function string pattern")
    public void fizzBuzzFunctionStringTest() {
        assertEquals("1", Helper.fizzBuzz("1"));
        assertEquals("2", Helper.fizzBuzz("2"));
        assertEquals("fizz", Helper.fizzBuzz("3"));
        assertEquals("4", Helper.fizzBuzz("4"));
        assertEquals("buzz", Helper.fizzBuzz("5"));
        assertEquals("fizzbuzz", Helper.fizzBuzz("15"));
    }

    @Test
    @DisplayName("fizzBuzz function double pattern")
    public void fizzBuzzFunctionDouble() {
        assertEquals("1", Helper.fizzBuzz(1.0));
        assertEquals("1", Helper.fizzBuzz(1.1));
        assertEquals("2", Helper.fizzBuzz(2.0));
        assertEquals("2", Helper.fizzBuzz(2.1));
        assertEquals("fizz", Helper.fizzBuzz(3.0));
        assertEquals("fizz", Helper.fizzBuzz(3.1));
        assertEquals("4", Helper.fizzBuzz(4.0));
        assertEquals("4", Helper.fizzBuzz(4.1));
        assertEquals("buzz", Helper.fizzBuzz(5.0));
        assertEquals("buzz", Helper.fizzBuzz(5.1));
        assertEquals("fizzbuzz", Helper.fizzBuzz(15.0));
        assertEquals("fizzbuzz", Helper.fizzBuzz(15.1));
    }

}