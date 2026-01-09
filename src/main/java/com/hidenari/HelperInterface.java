package com.hidenari;

public interface HelperInterface {
    default String fizzBuzz(int number) {
        var result = number % 3 == 0 ? "fizz" : "";
        result += number % 5 == 0 ? "buzz" : "";
        return result.isBlank() ? String.valueOf(number) : result;
    }

    default String fizzBuzz(String number) {
        return fizzBuzz(Integer.parseInt(number));
    }

    default String fizzBuzz(double number) {
        return fizzBuzz((int) number);
    }

    default void fizzBuzz(boolean number) {
        throw new IllegalArgumentException("boolean input invalid:" + number);
    }
}
