package TicTacToe.Models;

import TicTacToe.Exceptions.InvalidWinningStrategy;
import TicTacToe.Strategies.WinningStrategies.ColumnWinningStrategy;
import TicTacToe.Strategies.WinningStrategies.RowWinningStrategy;
import TicTacToe.Strategies.WinningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
//    private String gameId; //UUID
    private Board board;
    private List<Player> players;
    private List<Move> moveHistory;
    private GameStatus status;
    private int nextPlayerIndex;
    private List<WinningStrategy> winningStrategies;
    private Player winner;

    private Game(Builder builder) {
        //We'll initialise things here

        // Validate size and player numbers
        this.board = new Board(builder.size);

        // Validate all symbols of the players are unique
        this.players = builder.players;

        this.moveHistory = new ArrayList<>();
        this.status = GameStatus.IN_PROGRESS;
        this.nextPlayerIndex = 0;
        this.winningStrategies = new ArrayList<>();
        for(WinningStrategyType type: builder.getWinningStrategyTypes()){
            // Move this to a simple factory
            if(type == WinningStrategyType.ROW){
                this.winningStrategies.add(new RowWinningStrategy());
            }else if(type == WinningStrategyType.COLUMN){
                this.winningStrategies.add(new ColumnWinningStrategy());
            }else{
                throw new InvalidWinningStrategy("Invalid winning strategy");
            }
        }
        this.winner = null;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoveHistory() {
        return moveHistory;
    }

    public void setMoveHistory(List<Move> moveHistory) {
        this.moveHistory = moveHistory;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private int size;
        private List<Player> players;
        private List<WinningStrategyType> winningStrategyTypes;

        public int getSize() {
            return size;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public List<WinningStrategyType> getWinningStrategyTypes() {
            return winningStrategyTypes;
        }

        public Builder setWinningStrategyTypes(List<WinningStrategyType> winningStrategyTypes) {
            this.winningStrategyTypes = winningStrategyTypes;
            return this;
        }

        public Game build(){
            return new Game(this);
        }
    }
}
