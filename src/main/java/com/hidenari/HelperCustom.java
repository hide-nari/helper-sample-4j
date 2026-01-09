package com.hidenari;

public class HelperCustom extends Helper{
    @Override
    public String fizzBuzz(int number) {
        var result = super.fizzBuzz(number);
        return number % 30 == 0 ? result.toUpperCase() : result;
    }
}
