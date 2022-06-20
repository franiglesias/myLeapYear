package org.example.classic.tictactoe;

import org.example.classic.tictactoe.cell.Cell;
import org.example.classic.tictactoe.cell.EmptyCell;
import org.example.classic.tictactoe.cell.PlayerCell;
import org.example.classic.tictactoe.player.Player;

import java.util.Arrays;

public class Board {

    private final Cell[] cells;
    private final BoardPrinter boardPrinter = new BoardPrinter(this);
    private final Game game = new Game(this);
    private String winner;

    public Board() {
        cells = new Cell[9];
        Arrays.fill(cells, new EmptyCell());
    }

    public void put(Player player, Position position) throws TakenPositionException {
        ensureIsAvailable(position);
        takeForPlayer(position, new PlayerCell(player));
        verifyWeHaveWinner(player, position);
    }

    private void verifyWeHaveWinner(Player player, Position position) {
        winner = game.winner(player, position);
    }

    private void takeForPlayer(Position position, PlayerCell p) {
        cells[position.address()] = p;
    }

    private void ensureIsAvailable(Position position) throws TakenPositionException {
        at(position).assertIsAvailable();
    }

    boolean allCellsAreTaken() {
        for (Cell cell : cells) {
            if (!cell.isTaken()) return false;
        }
        return true;
    }

    public String draw() {
        return boardPrinter.draw();
    }

    public Cell at(int x, int y) {
        return at(new Position(x, y));
    }

    public Cell at(Position p) {
        return cells[p.address()];
    }

    public Cell[] cells() {
        return cells;
    }

    public String winner() {
        return winner;
    }
}
