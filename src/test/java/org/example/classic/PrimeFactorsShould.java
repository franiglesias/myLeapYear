package org.example.classic;

// 1 -> []
// Prime numbers -> [theNumber] (2, 3, 5, 7...)
// Compound numbers -> [prime, factors,...] (4, 6, 8, 9, 10, 12...)


// #	TRANSFORMATION			        STARTING CODE	    FINAL CODE
//------------------------------------------------------------------------------------------------------
// 1	{} => nil	            	                        return nil
// 2	nil => constant				    return nil		    return “1”
// 3	constant => constant+  		    return “1”		    return “1” + “2”
// 4	constant => scalar			    return “1” + “2”	return argument
// 5	statement => statements    		return argument	    return arguments / basic ops (split, add …)
// 6	unconditional => conditional	return arguments    if(condition)return arguments
// 7	scalar => array				    dog				    [dog, cat]
// 8	array => container			    [dog, cat]		    {dog = “DOG”, cat = “CAT”}
// 9	statement => tail recursion		a + b			    a + recursion
//10	conditional => loop			    if(condition)	    while(condition)
//11	tail recursion => full rec	    a + recursion	    recursion
//12	expression => function		    today - birthday	CalculateAge() / algorithm, library
//13	variable => mutation			day				    var day = 10; day = 11;
//14	switch case				        may be better to use a simpler solution starting from top again

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsShould {
    @Test
    void numberOneHasNoFactors() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(1);

        ArrayList<Integer> expected = new ArrayList<>();

        assertEquals(expected, factors);
    }

    @Test
    void number2() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(2);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);

        assertEquals(expected, factors);
    }

    @Test
    void number3() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(3);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);

        assertEquals(expected, factors);
    }

    @Test
    void number4() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(4);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);

        assertEquals(expected, factors);
    }

    @Test
    void number5() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(5);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(5);

        assertEquals(expected, factors);
    }

    @Test
    void number6() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(6);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);

        assertEquals(expected, factors);
    }

    @Test
    void number8() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(8);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(2);

        assertEquals(expected, factors);
    }

    @Test
    void number9() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(9);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(3);

        assertEquals(expected, factors);
    }

    @Test
    void number12() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(12);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(3);

        assertEquals(expected, factors);
    }

    @Test
    void number54() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(54);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(3);
        expected.add(3);

        assertEquals(expected, factors);
    }
}
