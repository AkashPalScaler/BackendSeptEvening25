package TicTacToe.Models;

public class BotPlayer extends Player{
    private BotDifficultyLevel level;

    public BotPlayer(String name, Character c, BotDifficultyLevel level) {
        super(name, new Symbol(c), PlayerType.BOT);
        this.level = level;
    }

    @Override
    public Move makeMove(Board board) {
        // Based on the bot difficulty level we should get the bot playing strategy using simple factory
        // Get the Move from the strategy
        // Validate and return the move
        return null;
    }
}
