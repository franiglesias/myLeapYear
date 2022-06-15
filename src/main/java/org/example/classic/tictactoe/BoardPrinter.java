package org.example.classic.tictactoe;

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

        if (winner() != null) {
            return String.format("Player %s won!\n\n", winner()) + board;
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