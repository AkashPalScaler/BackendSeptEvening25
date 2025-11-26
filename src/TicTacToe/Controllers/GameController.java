package TicTacToe.Controllers;

import TicTacToe.Models.Game;
import TicTacToe.Models.GameStatus;
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

    public void displayBoard(Game game) {
        game.getBoard().display();
    }

    public GameStatus getGameStatus(Game game) {
        return game.getStatus();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void undo(Game game) {
        game.undo();
    }
}
