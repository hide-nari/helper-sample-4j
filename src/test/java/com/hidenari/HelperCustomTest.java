package com.hidenari;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HelperCustomTest {
    private final HelperCustom<Integer> helperInt = new HelperCustom<>();
    private final HelperCustom<Double> helperDouble = new HelperCustom<>();
    private final HelperCustom<String> helperStr = new HelperCustom<>();
    private final HelperCustom<Boolean> helperBool = new HelperCustom<>();

    @Test
    @DisplayName("fizzBuzz function int pattern")
    public void fizzBuzzFunctionIntTest() {
        assertEquals("1", helperInt.fizzBuzz(1));
        assertEquals("2", helperInt.fizzBuzz(2));
        assertEquals("fizz", helperInt.fizzBuzz(3));
        assertEquals("4", helperInt.fizzBuzz(4));
        assertEquals("buzz", helperInt.fizzBuzz(5));
        assertEquals("fizzbuzz", helperInt.fizzBuzz(15));
        assertEquals("FIZZBUZZ", helperInt.fizzBuzz(30));
    }

    @Test
    @DisplayName("fizzBuzz function double pattern")
    public void fizzBuzzFunctionDoubleTest() {
        assertEquals("1.0", helperDouble.fizzBuzz(1.0));
        assertEquals("1.1", helperDouble.fizzBuzz(1.1));
        assertEquals("2.0", helperDouble.fizzBuzz(2.0));
        assertEquals("2.1", helperDouble.fizzBuzz(2.1));
        assertEquals("fizz", helperDouble.fizzBuzz(3.0));
        assertEquals("fizz", helperDouble.fizzBuzz(3.1));
        assertEquals("4.0", helperDouble.fizzBuzz(4.0));
        assertEquals("4.1", helperDouble.fizzBuzz(4.1));
        assertEquals("buzz", helperDouble.fizzBuzz(5.0));
        assertEquals("buzz", helperDouble.fizzBuzz(5.1));
        assertEquals("fizzbuzz", helperDouble.fizzBuzz(15.0));
        assertEquals("fizzbuzz", helperDouble.fizzBuzz(15.1));
        assertEquals("FIZZBUZZ", helperDouble.fizzBuzz(30.0));
        assertEquals("FIZZBUZZ", helperDouble.fizzBuzz(30.1));
    }

    @Test
    @DisplayName("fizzBuzz function string error pattern")
    public void fizzBuzzFunctionStringErrorTest() {
        assertThrows(IllegalArgumentException.class,
                () -> helperStr.fizzBuzz("1"));
        assertThrows(IllegalArgumentException.class,
                () -> helperStr.fizzBuzz("2"));
        assertThrows(IllegalArgumentException.class,
                () -> helperStr.fizzBuzz("3"));
        assertThrows(IllegalArgumentException.class,
                () -> helperStr.fizzBuzz("5"));
        assertThrows(IllegalArgumentException.class,
                () -> helperStr.fizzBuzz("15"));
        assertThrows(IllegalArgumentException.class,
                () -> helperStr.fizzBuzz("str"));
    }

    @Test
    @DisplayName("fizzBuzz function boolean true pattern")
    public void fizzBuzzFunctionBooleanTest() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> helperBool.fizzBuzz(true));
        assertEquals("boolean input invalid:true", exception.getMessage());
    }

    @Test
    @DisplayName("fizzBuzz function boolean false pattern")
    public void fizzBuzzFunctionBooleanFalseTest() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> helperBool.fizzBuzz(false));
        assertEquals("boolean input invalid:false", exception.getMessage());
    }
}