package com.hidenari;

interface HelperInterface<T> {
    default String fizzBuzz(T number) {
        String result = "";
        switch (number) {
            case Boolean value -> throw new IllegalArgumentException("boolean input invalid:" + value);
            case String value -> throw new IllegalArgumentException("string input invalid:" + value);
            case Integer value -> {
                result = value % 3 == 0 ? "fizz" : "";
                result += value % 5 == 0 ? "buzz" : "";
            }
            case Double value -> {
                result = value % 3 == 0 ? "fizz" : "";
                result += value % 5 == 0 ? "buzz" : "";
            }
            case null, default -> throw new IllegalArgumentException("input invalid null or default" + number);
        }
        return result.isBlank() ? String.valueOf(number) : result;
    }
}
