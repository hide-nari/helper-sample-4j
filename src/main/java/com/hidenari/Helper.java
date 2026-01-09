package com.hidenari;

public class Helper {
    public String fizzBuzz(int number) {
        var result = number % 3 == 0 ? "fizz" : "";
        result += number % 5 == 0 ? "buzz" : "";
        return result.isBlank() ? String.valueOf(number) : result;
    }

    public String fizzBuzz(String number) {
        return fizzBuzz(Integer.parseInt(number));
    }

    public String fizzBuzz(double number) {
        return fizzBuzz((int) number);
    }

}
