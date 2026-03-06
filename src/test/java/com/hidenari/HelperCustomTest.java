package com.hidenari;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("fizzBuzz function")
class HelperCustomTest {
    private final HelperCustom<? super Number> helper = new HelperCustom<>();
    private final HelperCustom<String> helperStr = new HelperCustom<>();
    private final HelperCustom<Boolean> helperBool = new HelperCustom<>();

    @Test
    @DisplayName("fizzBuzz() with int")
    void fizzBuzzFunctionIntTest() {
        assertEquals("FIZZBUZZ", helper.fizzBuzz(-30));
        assertEquals("fizzbuzz", helper.fizzBuzz(-15));
        assertEquals("-14", helper.fizzBuzz(-14));
        assertEquals("-13", helper.fizzBuzz(-13));
        assertEquals("fizz", helper.fizzBuzz(-12));
        assertEquals("-11", helper.fizzBuzz(-11));
        assertEquals("buzz", helper.fizzBuzz(-10));
        assertEquals("fizz", helper.fizzBuzz(-9));
        assertEquals("-8", helper.fizzBuzz(-8));
        assertEquals("-7", helper.fizzBuzz(-7));
        assertEquals("fizz", helper.fizzBuzz(-6));
        assertEquals("buzz", helper.fizzBuzz(-5));
        assertEquals("-4", helper.fizzBuzz(-4));
        assertEquals("fizz", helper.fizzBuzz(-3));
        assertEquals("-2", helper.fizzBuzz(-2));
        assertEquals("-1", helper.fizzBuzz(-1));
        assertEquals("FIZZBUZZ", helper.fizzBuzz(0));
        assertEquals("1", helper.fizzBuzz(1));
        assertEquals("2", helper.fizzBuzz(2));
        assertEquals("fizz", helper.fizzBuzz(3));
        assertEquals("4", helper.fizzBuzz(4));
        assertEquals("buzz", helper.fizzBuzz(5));
        assertEquals("fizz", helper.fizzBuzz(6));
        assertEquals("7", helper.fizzBuzz(7));
        assertEquals("8", helper.fizzBuzz(8));
        assertEquals("fizz", helper.fizzBuzz(9));
        assertEquals("buzz", helper.fizzBuzz(10));
        assertEquals("11", helper.fizzBuzz(11));
        assertEquals("fizz", helper.fizzBuzz(12));
        assertEquals("13", helper.fizzBuzz(13));
        assertEquals("14", helper.fizzBuzz(14));
        assertEquals("fizzbuzz", helper.fizzBuzz(15));
        assertEquals("FIZZBUZZ", helper.fizzBuzz(30));
    }

    @Test
    @DisplayName("fizzBuzz() with double")
    void fizzBuzzFunctionDoubleTest() {
        assertEquals("FIZZBUZZ", helper.fizzBuzz(-30.0));
        assertEquals("FIZZBUZZ", helper.fizzBuzz(-30.1));
        assertEquals("fizzbuzz", helper.fizzBuzz(-15.0));
        assertEquals("fizzbuzz", helper.fizzBuzz(-15.1));
        assertEquals("buzz", helper.fizzBuzz(-5.0));
        assertEquals("buzz", helper.fizzBuzz(-5.1));
        assertEquals("-4", helper.fizzBuzz(-4.0));
        assertEquals("-4", helper.fizzBuzz(-4.1));
        assertEquals("fizz", helper.fizzBuzz(-3.0));
        assertEquals("fizz", helper.fizzBuzz(-3.1));
        assertEquals("-2", helper.fizzBuzz(-2.0));
        assertEquals("-2", helper.fizzBuzz(-2.1));
        assertEquals("-1", helper.fizzBuzz(-1.0));
        assertEquals("-1", helper.fizzBuzz(-1.1));
        assertEquals("FIZZBUZZ", helper.fizzBuzz(0.0));
        assertEquals("FIZZBUZZ", helper.fizzBuzz(0.1));
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
    @DisplayName("fizzBuzz() with string ")
    void fizzBuzzFunctionStringErrorTest() {
        assertThrows(IllegalArgumentException.class,
                () -> helperStr.fizzBuzz("1"));
        assertThrows(IllegalArgumentException.class,
                () -> helperStr.fizzBuzz("2"));
        assertThrows(IllegalArgumentException.class,
                () -> helperStr.fizzBuzz("3"));
        assertThrows(IllegalArgumentException.class,
                () -> helperStr.fizzBuzz("4"));
        assertThrows(IllegalArgumentException.class,
                () -> helperStr.fizzBuzz("5"));
        assertThrows(IllegalArgumentException.class,
                () -> helperStr.fizzBuzz("15"));
        assertThrows(IllegalArgumentException.class,
                () -> helperStr.fizzBuzz("1st"));
    }

    @Test
    @DisplayName("fizzBuzz() with bool true")
    void fizzBuzzFunctionBooleanTest() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> helperBool.fizzBuzz(true));
        assertEquals("boolean input invalid:true", exception.getMessage());
    }

    @Test
    @DisplayName("fizzBuzz() with bool false")
    void fizzBuzzFunctionBooleanFalseTest() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> helperBool.fizzBuzz(false));
        assertEquals("boolean input invalid:false", exception.getMessage());
    }
}