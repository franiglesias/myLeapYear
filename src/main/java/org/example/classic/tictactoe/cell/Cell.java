package org.example.classic.tictactoe.cell;

import org.example.classic.tictactoe.TakenPositionException;

public interface Cell {

    boolean isTakenBy(String player);

    void assertIsAvailable() throws TakenPositionException;

    boolean isTaken();
}
