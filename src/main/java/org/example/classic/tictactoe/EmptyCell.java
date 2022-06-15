package org.example.classic.tictactoe;

public class EmptyCell implements Cell{
    @Override
    public boolean isTaken() {
        return false;
    }

    @Override
    public boolean isTakenBy(String player) {
        return false;
    }

    @Override
    public void assertIsAvailable() {
        // Empty cells are available
    }

    @Override
    public String toString() {
        return " ";
    }
}
