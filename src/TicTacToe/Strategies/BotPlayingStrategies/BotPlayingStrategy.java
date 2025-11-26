package TicTacToe.Strategies.BotPlayingStrategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.BotPlayer;
import TicTacToe.Models.Move;

public interface BotPlayingStrategy {
    public Move makeMove(Board board, BotPlayer botPlayer);
}
