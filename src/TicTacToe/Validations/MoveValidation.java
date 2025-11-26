package TicTacToe.Validations;

import TicTacToe.Models.Board;
import TicTacToe.Models.CellState;
import TicTacToe.Models.Move;

public class MoveValidation {
    public static boolean validate(Move move, Board board){
        int r = move.getCell().getR();
        int c = move.getCell().getC();
        if(r<0 || r> board.getSize() || c< 0 || c > board.getSize()){
            // HW: Throw a custom exception for this
            System.out.println("Invalid move: Out of the board.\nPlease try again!");
            return false;
        }
        CellState cellState = board.getGrid().get(r).get(c).getCellState();
        if(cellState.equals(CellState.FILLED)){
            // HW: Throw a custom exceptiomn
            System.out.println("Invalid move: Cell is already occupied.\nPlease try again!");
            return false;
        }
        return true;
        // Create separate exceptions for the above
    }
}
