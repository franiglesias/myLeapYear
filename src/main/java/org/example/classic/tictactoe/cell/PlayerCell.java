package org.example.classic.tictactoe.cell;

import org.example.classic.tictactoe.TakenPositionException;
import org.example.classic.tictactoe.cell.Cell;
import org.example.classic.tictactoe.player.Player;

import java.util.Objects;

public class PlayerCell implements Cell {
    private final String player;
    private Player thePlayer;

    public PlayerCell(String player) {
        this.player = player;
        this.thePlayer = null;
    }

    public PlayerCell(Player thePlayer) {
        this(thePlayer.symbol());
        this.thePlayer = thePlayer;
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
    public boolean isTaken() {
        return true;
    }

    @Override
    public String toString() {
        return player;
    }
}
