package TicTacToe.Models;

import TicTacToe.Validations.MoveValidation;

import java.util.Scanner;

public class HumanPlayer extends Player{
    Scanner sc = new Scanner(System.in);
    public HumanPlayer(String name, Character c) {
        super(name, new Symbol(c), PlayerType.HUMAN);
    }

    @Override
    public Move makeMove(Board board) {
        // Take input from scanner
        Move move;
        do{
            System.out.println("It's " + getName() + "'s turn : Please enter the row and the column");
            int row = sc.nextInt();
            int col = sc.nextInt();

            // Create the move
            move  = new Move(new Cell(row, col), this);
        }while(!MoveValidation.validate(move, board));
        // Return the move
        return move;
    }
}
