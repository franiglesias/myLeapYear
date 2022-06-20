package org.example.classic.tictactoe.player;

import org.example.classic.tictactoe.Board;
import org.example.classic.tictactoe.Position;
import org.example.classic.tictactoe.TakenPositionException;

public abstract class Player {
    public Player() {
    }

    public void move(Position position, Board board) throws TakenPositionException {
        board.put(this, position);
    }


    public abstract String symbol();

    public abstract Player exchange();
}
