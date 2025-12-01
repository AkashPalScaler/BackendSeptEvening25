package TicTacToe.Strategies.BotPlayingStrategies;

import TicTacToe.Models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getStrategy(BotDifficultyLevel level){
        if(level.equals(BotDifficultyLevel.EASY)){
            return new EasyBotPlayingStrategy();
        }else if(level.equals(BotDifficultyLevel.MEDIUM)) {
            return new MediumBotPlayingStrategy();
        }
        else{
            throw new RuntimeException("Invalid Difficulty Level");
        }
    }
}
