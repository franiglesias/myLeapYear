package org.example.classic;

public class Fibonacci {
    public Integer at(int position) {
        if (position <= 1) return position;

        return at(position - 1) + at(position - 2);
    }
}
