package org.example.classic;

//0  -> 0
//1  -> 1
//2  -> 1
//3  -> 2
//4  -> 3
//5  -> 5
//6  -> 8
//7  -> 13
//8  -> 21
//9  -> 34


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1,1",
            "2,1",
            "3,2",
            "4,3",
            "5,5",
            "6,8",
            "7,13",
            "8,21",
            "9,34"
    })
    void fibonacciNumberAtGivenPosition(Integer position, Integer expected) {

        Integer fbNumber = new Fibonacci().at(position);

        assertEquals(expected, fbNumber);
    }
}
