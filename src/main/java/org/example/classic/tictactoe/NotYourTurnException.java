package org.example.classic.tictactoe;

public class NotYourTurnException extends Exception{
    public NotYourTurnException(String player) {
        super(String.format("Player %s, It is not your turn.", player));
    }
}
