package org.example.classic.tictactoe;

public class Position {
    private final int x;
    private final int y;
    private final int SIZE = 3;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int address() {
        return (y * SIZE) + x;
    }

    public int row() {
        return y;
    }

    public int column() {
        return x;
    }
}
