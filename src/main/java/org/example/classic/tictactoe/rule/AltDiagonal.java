package org.example.classic.tictactoe.rule;

import org.example.classic.tictactoe.Board;

public class AltDiagonal implements WinRule {
    private final Board board;
    private final String player;
    private final WinRule next;

    public AltDiagonal(Board board, String player) {
        this.board = board;
        this.player = player;
        this.next = null;
    }

    public boolean isTakenBy() {
        return board.at(2, 0).isTakenBy(player)
                && board.at(1, 1).isTakenBy(player)
                && board.at(0, 2).isTakenBy(player);
    }

    @Override
    public String winner() {
        if (isTakenBy()) return player;
        if (next != null) return next.winner();
        return null;
    }
}
