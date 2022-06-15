package org.example.classic.tictactoe;

public class OPlayer extends Player {
    public OPlayer() {
    }

    @Override
    String symbol() {
        return "0";
    }

    @Override
    public Player exchange() {
        return new XPlayer();
    }
}
