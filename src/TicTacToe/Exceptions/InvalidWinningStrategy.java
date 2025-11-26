package TicTacToe.Exceptions;

public class InvalidWinningStrategy extends RuntimeException{
    public InvalidWinningStrategy(String message) {
        super(message);
    }
}
