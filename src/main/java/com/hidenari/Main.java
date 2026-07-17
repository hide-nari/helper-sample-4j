package com.hidenari;


public class Main {
    static void main() {
        for (int i = 0; i < 16; i++) {
            System.out.println(new Helper<>().fizzBuzz(i));
        }
    }
}
