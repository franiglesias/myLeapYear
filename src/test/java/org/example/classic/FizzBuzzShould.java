package org.example.classic;

// √ new FizzBuzz().say(1)  -> "1"  => "As is" (1, 2, 4...)
// V new FizzBuzz().say(multipleOf(3))  -> "Fizz"  (3, 6, 9...)
// √ new FizzBuzz().say(multipleOf(5))  -> "Buzz"  (5, 10, 25...)
// V new FizzBuzz().say(multipleOf(3) && multiple(5))  -> "FizzBuzz"  (15, 30, 45...)
// V domain 1..100

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    @Test
    void asIsNumbers() {
        assertEquals("1", new FizzBuzz().say(1));
        assertEquals("2", new FizzBuzz().say(2));
        assertEquals("Fizz", new FizzBuzz().say(3));
        assertEquals("Fizz", new FizzBuzz().say(6));
    }
}
