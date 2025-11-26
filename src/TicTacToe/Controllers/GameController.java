package TicTacToe.Controllers;

import TicTacToe.Models.Game;
import TicTacToe.Models.Player;
import TicTacToe.Models.WinningStrategyType;

import java.util.List;

public class GameController {
    // APIs
    // Return gameId
    public Game startGame(int size, List<Player> players, List<WinningStrategyType> types){
        return Game
                .getBuilder()
                .setSize(size)
                .setPlayers(players)
                .setWinningStrategyTypes(types)
                .build();
    }

    public void displayBoard(Game game1) {
        game1.getBoard().display();
    }
}
