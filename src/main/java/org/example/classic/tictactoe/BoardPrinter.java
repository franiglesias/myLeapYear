package org.example.classic.tictactoe;

import java.util.Objects;

public class BoardPrinter {
    private final Board board;

    public BoardPrinter(Board board) {
        this.board = board;
    }

    public String draw() {
        String format = """
                +---+---+---+
                | %s | %s | %s |
                +---+---+---+
                | %s | %s | %s |
                +---+---+---+
                | %s | %s | %s |
                +---+---+---+
                """;
        String board = String.format(format, cells());

        if (Objects.equals(winner(), "draw")) {
            return String.format("Draw! Game over\n\n%s",  board);
        }

        if (winner() != null) {
            return String.format("Player %s won!\n\n%s", winner(), board);
        }

        return board;
    }

    private Object[] cells() {
        return board.cells();
    }

    String winner() {
        return board.winner();
    }
}