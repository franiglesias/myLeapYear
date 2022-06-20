package org.example.classic.tictactoe.player;

public class OPlayer extends Player {
    public OPlayer() {
    }

    @Override
    public String symbol() {
        return "0";
    }

    @Override
    public Player exchange() {
        return new XPlayer();
    }
}
