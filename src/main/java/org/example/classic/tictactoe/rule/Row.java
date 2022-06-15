package org.example.classic.tictactoe.rule;

import org.example.classic.tictactoe.Board;

public class Row implements org.example.classic.tictactoe.rule.WinRule {
    private final int row;
    private final String player;
    private final WinRule next;
    private final Board board;

    public Row(Board board, int row, String player, WinRule next) {
        this.board = board;
        this.row = row;
        this.player = player;
        this.next = next;
    }

    public boolean isTakenBy() {
        return board.at(0, row).isTakenBy(player)
                && board.at(2, row).isTakenBy(player)
                && board.at(1, row).isTakenBy(player);
    }

    @Override
    public String winner() {
        if (isTakenBy()) return player;
        if (next != null) return next.winner();
        return null;
    }
}
