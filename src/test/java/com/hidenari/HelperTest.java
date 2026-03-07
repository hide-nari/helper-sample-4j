package com.hidenari;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("fizzBuzz custom function")
class HelperTest {
    private final Helper<? super Number> helper = new Helper<>();
    private final Helper<String> helperStr = new Helper<>();
    private final Helper<Boolean> helperBool = new Helper<>();

    @ParameterizedTest(name = "{index}:{arguments}")
    @ValueSource(strings = {
            "-30,fizzbuzz",
            "-15,fizzbuzz",
            "-14,-14",
            "-13,-13",
            "-12,fizz",
            "-11,-11",
            "-10,buzz",
            "-9,fizz",
            "-8,-8",
            "-7,-7",
            "-6,fizz",
            "-5,buzz",
            "-4,-4",
            "-3,fizz",
            "-2,-2",
            "-1,-1",
            "0,fizzbuzz",
            "1,1",
            "2,2",
            "3,fizz",
            "4,4",
            "5,buzz",
            "6,fizz",
            "7,7",
            "8,8",
            "9,fizz",
            "10,buzz",
            "11,11",
            "12,fizz",
            "13,13",
            "14,14",
            "15,fizzbuzz",
            "30,fizzbuzz",
    }
    )
    @DisplayName("fizzBuzz() with int")
    void fizzBuzzFunctionIntTest(String arguments) {
        String[] paramArray = arguments.split(",");
        int argsValue = Integer.parseInt(paramArray[0]);
        var expectValue = paramArray[1];

        assertEquals(expectValue, helper.fizzBuzz(argsValue));
    }

    @Test
    @DisplayName("fizzBuzz() with double")
    void fizzBuzzFunctionDouble() {
        assertEquals("fizzbuzz", helper.fizzBuzz(-30.0));
        assertEquals("fizzbuzz", helper.fizzBuzz(-30.1));
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
        assertEquals("fizzbuzz", helper.fizzBuzz(0.0));
        assertEquals("fizzbuzz", helper.fizzBuzz(0.1));
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
        assertEquals("fizzbuzz", helper.fizzBuzz(30.0));
        assertEquals("fizzbuzz", helper.fizzBuzz(30.1));
    }

    @Test
    @DisplayName("fizzBuzz() with string")
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
        assertEquals("Unexpected value:true", exception.getMessage());
    }

    @Test
    @DisplayName("fizzBuzz() with bool false")
    void fizzBuzzFunctionBooleanFalseTest() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> helperBool.fizzBuzz(false));
        assertEquals("Unexpected value:false", exception.getMessage());
    }
}