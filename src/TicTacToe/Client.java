package TicTacToe;

import TicTacToe.Controllers.GameController;
import TicTacToe.Models.*;
import TicTacToe.Strategies.WinningStrategies.RowWinningStrategy;
import TicTacToe.Strategies.WinningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        int size = 3;
        GameController gameController = new GameController();
        Scanner sc = new Scanner(System.in);
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

        while(gameController.getGameStatus(game1).equals(GameStatus.IN_PROGRESS)){
            // Display the board
            gameController.displayBoard(game1);
            // Then we should ask player to make a move
            gameController.makeMove(game1);

            gameController.displayBoard(game1);

            System.out.println("Do you want to undo? [Y/N]");
            String input = sc.nextLine();
            // Validate the input - keep asking until you get valid input

            if(input.equals("Y")){
                gameController.undo(game1);
            }
        }

        if(gameController.getGameStatus(game1).equals(GameStatus.WIN)){
            System.out.println(gameController.getWinner(game1).getName() + " has won");
        }else{
            System.out.println("Game is draw!");
        }
    }
}
