package com.hidenari;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("fizzBuzz custom function")
class HelperTest {
    private final Helper<? super Number> helper = new Helper<>();

    @ParameterizedTest(name = "{index}:{arguments}")
    @CsvFileSource(resources = "/fizzBuzzIntLists.csv", numLinesToSkip = 1)
    @DisplayName("fizzBuzz() with int")
    void fizzBuzzFunctionIntTest(int argsValue, String expectValue) {
        assertEquals(expectValue, helper.fizzBuzz(argsValue));
    }

    @ParameterizedTest(name = "{index}:{arguments}")
    @CsvFileSource(resources = "/fizzBuzzDoubleLists.csv", numLinesToSkip = 1)
    @DisplayName("fizzBuzz() with double")
    void fizzBuzzFunctionDouleTest(double argsValue, String expectValue) {
        assertEquals(expectValue, helper.fizzBuzz(argsValue));
    }

    @Test
    @DisplayName("fizzBuzz() with string")
    void fizzBuzzFunctionStringErrorTest() {
        assertThrows(IllegalArgumentException.class,
                () -> new Helper<String>().fizzBuzz("1"));
        assertThrows(IllegalArgumentException.class,
                () -> new Helper<String>().fizzBuzz("2"));
        assertThrows(IllegalArgumentException.class,
                () -> new Helper<String>().fizzBuzz("3"));
        assertThrows(IllegalArgumentException.class,
                () -> new Helper<String>().fizzBuzz("1st"));
    }

    @Test
    @DisplayName("fizzBuzz() with bool true")
    void fizzBuzzFunctionBooleanTest() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> new Helper<Boolean>().fizzBuzz(true));
        assertEquals("Unexpected value:true", exception.getMessage());
    }

    @Test
    @DisplayName("fizzBuzz() with bool false")
    void fizzBuzzFunctionBooleanFalseTest() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> new Helper<Boolean>().fizzBuzz(false));
        assertEquals("Unexpected value:false", exception.getMessage());
    }
}