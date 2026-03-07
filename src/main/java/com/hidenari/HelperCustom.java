package com.hidenari;

public class HelperCustom<T> extends Helper<T> {
    @Override
    public String fizzBuzz(T number) {
        String result = super.fizzBuzz(number);
        return switch (number) {
            case Integer value -> value % 30 == 0 ? result.toUpperCase() : result;
            case Double value -> value.intValue() % 30 == 0 ? result.toUpperCase() : result;
            default -> throw new IllegalArgumentException("Unexpected value:" + number);
        };
    }
//    @Override
//    public String fizzBuzz(int number) {
//        var result = super.fizzBuzz(number);
//        return number % 30 == 0 ? result.toUpperCase() : result;
//    }
}
