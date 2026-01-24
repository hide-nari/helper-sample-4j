package com.hidenari;

public class HelperCustom<T> extends Helper<T> {
    @Override
    public String fizzBuzz(T number) {
        String result = super.fizzBuzz(number);
        return Integer.parseInt(result) % 30 == 0 ? result.toUpperCase() : result;
    }

//    @Override
//    public String fizzBuzz(int number) {
//        var result = super.fizzBuzz(number);
//        return number % 30 == 0 ? result.toUpperCase() : result;
//    }
}
