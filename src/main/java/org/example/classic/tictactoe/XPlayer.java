package org.example.classic.tictactoe;

public class XPlayer extends Player {
    public XPlayer() {

    }

    @Override
    String symbol() {
        return "X";
    }

    @Override
    public Player exchange() {
        return new OPlayer();
    }
}
