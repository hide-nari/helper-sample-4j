package com.hidenari;

public class HelperCustom<T> extends Helper<T> {
    @Override
    public String fizzBuzz(T number) {
        String result = super.fizzBuzz(number);
        return Integer.parseInt(result) % 30 == 0 ? result.toUpperCase() : result;
    }
}
