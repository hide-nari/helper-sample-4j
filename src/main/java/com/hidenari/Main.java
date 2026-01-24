package com.hidenari;

import java.util.List;

public class Main {
    static void main() {
        System.out.println(new Helper<Integer>().fizzBuzz(3));
        System.out.println(new Helper<Integer>().fizzBuzz(15));
        System.out.println(new Helper<Integer>().fizzBuzz(4));
        System.out.println(new Helper<Double>().fizzBuzz(3.0));
    }
}
