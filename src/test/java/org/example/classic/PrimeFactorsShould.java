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

        assertEquals(0, factors.size());
    }

    @Test
    void numberTwoIsPrime() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(2);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);

        assertEquals(expected, factors);
    }

    @Test
    void numberThreeIsPrime() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(3);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);

        assertEquals(expected, factors);
    }

    @Test
    void numberFourIsCompound() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(4);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);

        assertEquals(expected, factors);
    }

    @Test
    void numberFiveIsPrime() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(5);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(5);

        assertEquals(expected, factors);
    }

    @Test
    void numberSixIsCompound() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(6);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);

        assertEquals(expected, factors);
    }

    @Test
    void numberEightIsCompound() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(8);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(2);

        assertEquals(expected, factors);
    }

    @Test
    void numberNineIsCompound() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(9);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(3);

        assertEquals(expected, factors);
    }

    @Test
    void numberTenIsCompound() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(10);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);

        assertEquals(expected, factors);
    }

    @Test
    void numberTwelveIsCompound() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(12);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(3);

        assertEquals(expected, factors);
    }

    @Test
    void numberFifteenIsCompound() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(15);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(5);

        assertEquals(expected, factors);
    }

    @Test
    void numberSixteenIsCompound() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(16);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(2);
        expected.add(2);

        assertEquals(expected, factors);
    }

    @Test
    void numberEighteenIsCompound() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(18);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(3);

        assertEquals(expected, factors);
    }

    @Test
    void number27IsCompound() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(27);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(3);
        expected.add(3);

        assertEquals(expected, factors);
    }

    @Test
    void number54IsCompound() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(54);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(3);
        expected.add(3);

        assertEquals(expected, factors);
    }



}
