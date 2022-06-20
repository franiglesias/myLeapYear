package org.example.classic.tictactoe.cell;

import org.example.classic.tictactoe.cell.Cell;

public class EmptyCell implements Cell {

    @Override
    public boolean isTakenBy(String player) {
        return false;
    }

    @Override
    public void assertIsAvailable() {
        // Empty cells are available
    }

    @Override
    public boolean isTaken() {
        return false;
    }

    @Override
    public String toString() {
        return " ";
    }
}
