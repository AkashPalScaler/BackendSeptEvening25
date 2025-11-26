package TicTacToe.Models;

import TicTacToe.Strategies.BotPlayingStrategies.BotPlayingStrategy;
import TicTacToe.Strategies.BotPlayingStrategies.BotPlayingStrategyFactory;

public class BotPlayer extends Player{
    private BotDifficultyLevel level;

    public BotPlayer(String name, Character c, BotDifficultyLevel level) {
        super(name, new Symbol(c), PlayerType.BOT);
        this.level = level;
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("It's " + getName() + "'s turn.");
        // Based on the bot difficulty level we should get the bot playing strategy using simple factory
        BotPlayingStrategy strategy = BotPlayingStrategyFactory.getStrategy(level);
        // Get the Move from the strategy
        return strategy.makeMove(board, this);
    }
}
