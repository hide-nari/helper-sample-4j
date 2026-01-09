package com.hidenari;

public class Helper {
    public String fizzBuzz(int number) {
        var result = number % 3 == 0 ? "fizz" : "";
        result += number % 5 == 0 ? "buzz" : "";
        return result.isEmpty() ? result : String.valueOf(number);
    }
}
