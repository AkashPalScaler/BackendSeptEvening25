package TicTacToe.Strategies.BotPlayingStrategies;

import TicTacToe.Models.*;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, BotPlayer botPlayer) {
        // Another algo for a smarter gameplay
        // Another algo which will call another AI agent API to get smart move
        for(List<Cell> row : board.getGrid()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(new Cell(cell.getR(), cell.getC()), botPlayer);
                }
            }
        }
        return null;
    }
}
