package com.hidenari;

interface HelperInterface<T> {
    default String fizzBuzz(T number) {
        String result = switch (number) {
            case Integer value -> makeResultString(value);
            case Double value -> makeResultString(value.intValue());
            case String value -> throw new IllegalArgumentException("string input invalid:" + value);
            case Boolean value -> throw new IllegalArgumentException("boolean input invalid:" + value);
            case null, default -> throw new IllegalArgumentException("input invalid null or default" + number);
        };
        return result.isBlank() ? number.toString() : result;
    }

    private String makeResultString(int value) {
        return (value % 3 == 0 ? "fizz" : "") + (value % 5 == 0 ? "buzz" : "");
    }
//    default String fizzBuzz(int number) {
//        var result = number % 3 == 0 ? "fizz" : "";
//        result += number % 5 == 0 ? "buzz" : "";
//        return result.isBlank() ? number.toString() : result;
//    }
//
//    default String fizzBuzz(String number) {
//        return fizzBuzz(Integer.parseInt(number));
//    }
//
//    default String fizzBuzz(double number) {
//        return fizzBuzz((int) number);
//    }
//
//    default void fizzBuzz(boolean number) {
//        throw new IllegalArgumentException("boolean input invalid:" + number);
//    }
}
