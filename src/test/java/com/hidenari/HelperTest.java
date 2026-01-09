package com.hidenari;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelperTest {

    @Test
    @DisplayName("fizzBuzz function test")
    public void fizzBuzzFunctionTest() {
        assertEquals("1", Helper.fizzBuzz(1));
        assertEquals("2", Helper.fizzBuzz(2));
        assertEquals("fizz", Helper.fizzBuzz(3));
        assertEquals("4", Helper.fizzBuzz(4));
        assertEquals("buzz", Helper.fizzBuzz(5));
        assertEquals("fizzbuzz", Helper.fizzBuzz(15));
    }
}