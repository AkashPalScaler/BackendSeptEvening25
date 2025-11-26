package TicTacToe;

import TicTacToe.Controllers.GameController;
import TicTacToe.Models.*;
import TicTacToe.Strategies.WinningStrategies.RowWinningStrategy;
import TicTacToe.Strategies.WinningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        int size = 3;
        GameController gameController = new GameController();

        // HW: Player creation should be done using UserController -> UserController.createPlayer();
        Player player1 = new HumanPlayer("Akash", 'X');
        Player player2 = new BotPlayer("Botty", 'O', BotDifficultyLevel.EASY); // String input for level

        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        List<WinningStrategyType> winningStrategyTypes = new ArrayList<>();
        winningStrategyTypes.add(WinningStrategyType.ROW); // String type
        winningStrategyTypes.add(WinningStrategyType.COLUMN);

        Game game1 = gameController.startGame(size, players, winningStrategyTypes);

        gameController.displayBoard(game1);
    }
}
