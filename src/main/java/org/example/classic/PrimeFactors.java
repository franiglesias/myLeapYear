package org.example.classic;

import java.util.ArrayList;

public class PrimeFactors {
    public ArrayList<Integer> decompose(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        int divisor = 2;

        while (number > 1) {
            while (number % divisor == 0) {
                factors.add(divisor);
                number = number / divisor;
            }

            divisor++;
        }
        return factors;
    }
}
