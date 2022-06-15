package org.example.classic.tictactoe.rule;

import org.example.classic.tictactoe.Board;

public class Column implements WinRule {
    private final int column;
    private final String player;
    private final WinRule next;
    private final Board board;


    public Column(Board board, int column, String player, WinRule next) {

        this.board = board;
        this.column = column;
        this.player = player;
        this.next = next;
    }

    public boolean isTakenBy() {
        return board.at(column, 0).isTakenBy(player)
                && board.at(column, 1).isTakenBy(player)
                && board.at(column, 2).isTakenBy(player);
    }

    @Override
    public String winner() {
        if (isTakenBy()) return player;
        if (next != null) return next.winner();
        return null;
    }
}
