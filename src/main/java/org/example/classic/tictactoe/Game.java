package org.example.classic.tictactoe;

import org.example.classic.tictactoe.player.Player;
import org.example.classic.tictactoe.rule.*;

public class Game {
    private final Board board;

    public Game(Board board) {
        this.board = board;
    }

    String winner(Player player, Position position) {
        String symbol = player.symbol();
        if (board.allCellsAreTaken()) {
            return "draw";
        }

        WinRule winRule = new Row(board, position.row(), symbol,
                new Column(board, position.column(), symbol,
                        new Diagonal(board, symbol,
                                new AltDiagonal(board, symbol)
                        )
                )
        );

        return winRule.winner();
    }

}