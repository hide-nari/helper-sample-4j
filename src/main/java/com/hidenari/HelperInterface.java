package com.hidenari;

interface HelperInterface<T> {
    default String fizzBuzz(T number) {
        return switch (number) {
            case Integer value -> makeResultString(value);
            case Double value -> makeResultString(value.intValue());
            default -> throw new IllegalArgumentException("Unexpected value:" + number);
        };
    }

    private String makeResultString(int value) {
        String result = (value % 3 == 0 ? "fizz" : "") + (value % 5 == 0 ? "buzz" : "");
        return result.isBlank() ? String.valueOf(value) : result;
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
