package TicTacToe.Models;

public abstract class Player {
    private String name;
    private Symbol symbol;
    private PlayerType  playerType;

    public abstract Move makeMove(Board board);

    public Player(String name, Symbol sym, PlayerType playerType) {
        this.name = name;
        this.symbol = sym;
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol sym) {
        this.symbol = sym;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
