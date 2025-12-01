package TicTacToe.Strategies.WinningStrategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

import java.util.HashMap;
// 0 -> {x: 1, o:1}, 1 -> {x: , o:}, 2 -> {x: , o:}
// [{x: 1, o:1}, {x: 0, o:0}, {x: 1, o:2}]
public class RowWinningStrategy implements WinningStrategy{
    HashMap<Integer, HashMap<Character, Integer>> rowMap;

    public RowWinningStrategy(){
        rowMap = new HashMap<>();
    }

    @Override
    public boolean checkWinner(Board board, Move move) {
        // we need the row to update the hashmap
        int row = move.getCell().getR();
        Character symbol = move.getPlayer().getSymbol().getSym();
//        if(!rowMap.containsKey(row)){
//            rowMap.put(row, new HashMap<>());
//        }
        rowMap.putIfAbsent(row, new HashMap<>());
        HashMap<Character, Integer> countMap = rowMap.get(row);
        countMap.putIfAbsent(symbol, 0);
        countMap.put(symbol, countMap.get(symbol) + 1);

        // If count has reached the size of board -> means full row has same symbol
        if(countMap.get(symbol) == board.getSize()){
            return true;
        }
        return false;
    }

    @Override
    public void handleUndo(Move move) {
        int row = move.getCell().getR();
        Character symbol = move.getPlayer().getSymbol().getSym();
        HashMap<Character, Integer> countMap = rowMap.get(row);
        countMap.put(symbol, countMap.get(symbol)-1);
    }
}
