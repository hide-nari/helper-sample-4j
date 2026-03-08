package com.hidenari;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("fizzBuzz custom function")
class HelperCustomTest {

    @Nested
    @DisplayName("fizzBuzz() custom group")
    class FizzBuzzTest {
        private final HelperCustom<? super Number> helper = new HelperCustom<>();

        @ParameterizedTest(name = "{index}:{arguments}")
        @CsvFileSource(resources = "/fizzBuzzIntListsCommon.csv", numLinesToSkip = 1)
        @CsvFileSource(resources = "/fizzBuzzIntListsCustom.csv", numLinesToSkip = 1)
        @DisplayName("fizzBuzz() with int")
        void fizzBuzzFunctionIntTest(int argsValue, String expectValue) {
            assertEquals(expectValue, helper.fizzBuzz(argsValue));
        }

        @ParameterizedTest(name = "{index}:{arguments}")
        @CsvFileSource(resources = "/fizzBuzzDoubleListsCommon.csv", numLinesToSkip = 1)
        @CsvFileSource(resources = "/fizzBuzzDoubleListsCustom.csv", numLinesToSkip = 1)
        @DisplayName("fizzBuzz() with double")
        void fizzBuzzFunctionDoubleTest(double argsValue, String expectValue) {
            assertEquals(expectValue, helper.fizzBuzz(argsValue));
        }
    }

    @Nested
    @DisplayName("fizzBuzz() Custom Error Group")
    class FizzBuzzErrorTest {

        @ParameterizedTest(name = "{index}:{arguments}")
        @ValueSource(strings = {"1", "1st", "2", "2nd", "3rd"})
        @DisplayName("fizzBuzz() Custom with string")
        void fizzBuzzFunctionStringErrorTest(String argsValue) {
            IllegalArgumentException exception =
                    assertThrows(IllegalArgumentException.class,
                            () -> new Helper<String>().fizzBuzz(argsValue));
            assertEquals("Unexpected value:" + argsValue, exception.getMessage());
        }

        @ParameterizedTest(name = "{index}:{arguments}")
        @ValueSource(booleans = {true, false})
        @DisplayName("fizzBuzz() Custom with bool true")
        void fizzBuzzFunctionBooleanTest(boolean argsValue) {
            IllegalArgumentException exception =
                    assertThrows(IllegalArgumentException.class,
                            () -> new Helper<Boolean>().fizzBuzz(argsValue));
            assertEquals("Unexpected value:" + argsValue, exception.getMessage());
        }
    }
}