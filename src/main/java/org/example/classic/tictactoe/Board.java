package org.example.classic.tictactoe;

import org.example.classic.tictactoe.rule.*;

import java.util.Arrays;

public class Board {

    private final Cell[] cells;
    private final BoardPrinter boardPrinter = new BoardPrinter(this);
    private String winner;

    public Board() {
        cells = new Cell[9];
        Arrays.fill(cells, new EmptyCell());
    }

    public void put(String player, int x, int y) throws TakenPositionException {
        at(new Position(x, y)).assertIsAvailable();
        cells[new Position(x, y).address()] = new PlayerCell(player);
        winner = winner(player, x, y);
    }

    public String draw() {
        return boardPrinter.draw();
    }

    private String winner(String player, int x, int y) {
        WinRule winRule = new Row(this, y, player,
                new Column(this, x, player,
                        new Diagonal(this, player,
                                new AltDiagonal(this, player)
                        )
                )
        );

        return winRule.winner();
    }

    public Cell at(int x, int y) {
        return at(new Position(x, y));
    }

    public Cell at(Position p) {
        return cells[p.address()];
    }

    public Object[] cells() {
        return cells;
    }

    public String winner() {
        return winner;
    }
}
