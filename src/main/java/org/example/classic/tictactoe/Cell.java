package org.example.classic.tictactoe;

public interface Cell {
    boolean isTaken();

    boolean isTakenBy(String player);

    void assertIsAvailable() throws TakenPositionException;
}
