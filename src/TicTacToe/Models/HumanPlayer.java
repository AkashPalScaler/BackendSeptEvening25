package TicTacToe.Models;

public class HumanPlayer extends Player{
    public HumanPlayer(String name, Character c) {
        super(name, new Symbol(c), PlayerType.HUMAN);
    }

    @Override
    public Move makeMove(Board board) {
        // Take input from scanner
        // Create the move
        // Validate the move
        // Return the move
        return null;
    }
}
