package com.hidenari;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("fizzBuzz")
class HelperTest {

    @Nested
    @DisplayName("fizzBuzz() group")
    class FizzBuzzTest {
        private final Helper<? super Number> helper = new Helper<>();

        @ParameterizedTest(name = "{index}:{arguments}")
        @CsvFileSource(resources = "/fizzBuzzIntListsCommon.csv", numLinesToSkip = 1)
        @CsvFileSource(resources = "/fizzBuzzIntListsOrigin.csv", numLinesToSkip = 1)
        @DisplayName("fizzBuzz() with int")
        void fizzBuzzFunctionIntTest(int argsValue, String expectValue) {
            assertEquals(expectValue, helper.fizzBuzz(argsValue));
        }

        @ParameterizedTest(name = "{index}:{arguments}")
        @CsvFileSource(resources = "/fizzBuzzDoubleListsCommon.csv", numLinesToSkip = 1)
        @CsvFileSource(resources = "/fizzBuzzDoubleListsOrigin.csv", numLinesToSkip = 1)
        @DisplayName("fizzBuzz() with double")
        void fizzBuzzFunctionDoubleTest(double argsValue, String expectValue) {
            assertEquals(expectValue, helper.fizzBuzz(argsValue));
        }

    }

    @Nested
    @DisplayName("fizzBuzz() error group")
    class FizzBuzzErrorTest {

        @ParameterizedTest(name = "{index}:{arguments}")
        @ValueSource(strings = {"1", "1st", "2", "2nd", "3rd"})
        @DisplayName("fizzBuzz() with string")
        void fizzBuzzFunctionStringErrorTest(String argsValue) {
            IllegalArgumentException exception =
                    assertThrows(IllegalArgumentException.class,
                            () -> new Helper<String>().fizzBuzz(argsValue));
            assertEquals("Unexpected value:" + argsValue, exception.getMessage());
        }

        @ParameterizedTest(name = "{index}:{arguments}")
        @ValueSource(booleans = {true, false})
        @DisplayName("fizzBuzz() with bool")
        void fizzBuzzFunctionBooleanTest(boolean argsValue) {
            IllegalArgumentException exception =
                    assertThrows(IllegalArgumentException.class,
                            () -> new Helper<Boolean>().fizzBuzz(argsValue));
            assertEquals("Unexpected value:" + argsValue, exception.getMessage());
        }
    }
}