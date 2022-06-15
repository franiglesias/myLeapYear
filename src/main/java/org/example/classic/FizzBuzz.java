package org.example.classic;

public class FizzBuzz {
    public String say(int number) {
        if (number % 3 == 0) return "Fizz";
        return String.valueOf(number);
    }
}
