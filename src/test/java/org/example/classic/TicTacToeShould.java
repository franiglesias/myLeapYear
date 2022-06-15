package org.example.classic;

import org.example.classic.tictactoe.TakenPositionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TicTacToeShould {

    private TicTacToe game;

    @BeforeEach
    void setUp() {
        game = new TicTacToe();
    }

    @Test
    void withEmptyBoard() {
        String status = game.start();
        String expected = """
                +---+---+---+
                |   |   |   |
                +---+---+---+
                |   |   |   |
                +---+---+---+
                |   |   |   |
                +---+---+---+
                """;
        assertEquals(expected, status);
    }

    @Test
    void XMovesFirstToCentralPositions() throws TakenPositionException {
        game.start();
        String status = game.play(1, 1);
        String expected = """
                +---+---+---+
                |   |   |   |
                +---+---+---+
                |   | X |   |
                +---+---+---+
                |   |   |   |
                +---+---+---+
                """;
        assertEquals(expected, status);
    }

    @Test
    void XMovesFirstToOtherPositions() throws TakenPositionException {
        game.start();
        String status = game.play(1, 0);
        String expected = """
                +---+---+---+
                |   | X |   |
                +---+---+---+
                |   |   |   |
                +---+---+---+
                |   |   |   |
                +---+---+---+
                """;
        assertEquals(expected, status);
    }

    @Test
    void notAllowMovingToTakenPosition() throws TakenPositionException {
        game.start();
        game.play(1, 0);

        assertThrows(TakenPositionException.class, () -> game.play(1, 0));
    }

    @Test
    void finishGameWhenHorizontalRowCompleted() throws TakenPositionException {
        game.start();
        game.play(0, 0);
        game.play(1, 1);
        game.play(1, 0);
        game.play(0, 2);
        String status = game.play(2, 0);

        String expected = """
                Player X won!
                                
                +---+---+---+
                | X | X | X |
                +---+---+---+
                |   | 0 |   |
                +---+---+---+
                | 0 |   |   |
                +---+---+---+
                """;

        assertEquals(expected, status);
    }

    @Test
    void finishGameWhenOtherHorizontalRowCompleted() throws TakenPositionException {
        game.start();
        game.play(0, 1);
        game.play(1, 0);
        game.play(1, 1);
        game.play(0, 2);
        String status = game.play(2, 1);

        String expected = """
                Player X won!
                                
                +---+---+---+
                |   | 0 |   |
                +---+---+---+
                | X | X | X |
                +---+---+---+
                | 0 |   |   |
                +---+---+---+
                """;

        assertEquals(expected, status);
    }

    @Test
    void finishGameWhenColumnCompleted() throws TakenPositionException {
        game.start();
        game.play(2, 0);
        game.play(1, 1);
        game.play(2, 1);
        game.play(1, 0);
        String status = game.play(2, 2);

        String expected = """
                Player X won!
                                
                +---+---+---+
                |   | 0 | X |
                +---+---+---+
                |   | 0 | X |
                +---+---+---+
                |   |   | X |
                +---+---+---+
                """;

        assertEquals(expected, status);
    }

    @Test
    void finishGameWhenDiagonalCompleted() throws TakenPositionException {
        game.start();
        game.play(0, 0);
        game.play(1, 0);
        game.play(1, 1);
        game.play(1, 2);
        String status = game.play(2, 2);

        String expected = """
                Player X won!
                                
                +---+---+---+
                | X | 0 |   |
                +---+---+---+
                |   | X |   |
                +---+---+---+
                |   | 0 | X |
                +---+---+---+
                """;

        assertEquals(expected, status);
    }

    @Test
    void finishGameWhenAltDiagonalCompleted() throws TakenPositionException {
        game.start();
        game.play(2, 0);
        game.play(1, 0);
        game.play(1, 1);
        game.play(1, 2);
        String status = game.play(0, 2);

        String expected = """
                Player X won!
                                
                +---+---+---+
                |   | 0 | X |
                +---+---+---+
                |   | X |   |
                +---+---+---+
                | X | 0 |   |
                +---+---+---+
                """;

        assertEquals(expected, status);
    }
}
