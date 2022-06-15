package org.example.classic.tictactoe;

public abstract class Player {
    public Player() {
    }

    public void move(int x, int y, Board board) throws TakenPositionException {
        board.put(symbol(), x, y);
    }

    abstract String symbol();

    public abstract Player exchange();
}
