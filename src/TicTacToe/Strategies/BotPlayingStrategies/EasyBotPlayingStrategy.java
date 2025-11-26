package TicTacToe.Strategies.BotPlayingStrategies;

import TicTacToe.Models.*;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, BotPlayer botPlayer) {
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
