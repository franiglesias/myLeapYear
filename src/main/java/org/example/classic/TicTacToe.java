package org.example.classic;

import org.example.classic.tictactoe.Board;
import org.example.classic.tictactoe.Player;
import org.example.classic.tictactoe.TakenPositionException;
import org.example.classic.tictactoe.XPlayer;

public class TicTacToe {

    private final Board board;
    private Player player;

    public TicTacToe() {
        board = new Board();
        player = new XPlayer();
    }

    public String start() {
        return drawBoard();
    }

    public String play(int x, int y) throws TakenPositionException {
        player.move(x, y, board);
        player = player.exchange();
        return drawBoard();
    }

    private String drawBoard() {
        return board.draw();
    }


}
