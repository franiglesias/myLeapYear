package org.example.classic.tictactoe.player;

public class XPlayer extends Player {
    public XPlayer() {

    }

    @Override
    public String symbol() {
        return "X";
    }

    @Override
    public Player exchange() {
        return new OPlayer();
    }
}
