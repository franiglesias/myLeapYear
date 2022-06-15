package org.example.classic.tictactoe;

import java.util.Objects;

class PlayerCell implements Cell {
    private final String player;

    public PlayerCell(String player) {

        this.player = player;
    }

    @Override
    public boolean isTaken() {
        return true;
    }

    @Override
    public boolean isTakenBy(String player) {
        return Objects.equals(player, this.player);
    }

    @Override
    public void assertIsAvailable() throws TakenPositionException {
        throw new TakenPositionException();
    }

    @Override
    public String toString() {
        return player;
    }
}
