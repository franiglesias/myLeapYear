package org.example.classic;

import org.example.classic.tictactoe.Board;
import org.example.classic.tictactoe.Position;
import org.example.classic.tictactoe.player.Player;
import org.example.classic.tictactoe.TakenPositionException;
import org.example.classic.tictactoe.player.XPlayer;

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
        Position position = new Position(x, y);
        player.move(position, board);
        player = player.exchange();
        return drawBoard();
    }

    private String drawBoard() {
        return board.draw();
    }


}
