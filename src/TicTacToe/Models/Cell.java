package TicTacToe.Models;

public class Cell {
    private int r;
    private int c;
    private CellState cellState;
    private Symbol symbol;

    public Cell(int r, int c) {
        this.r = r;
        this.c = c;
        this.cellState = CellState.EMPTY;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void display(){
        if(cellState.equals(CellState.EMPTY)){
            System.out.print("| - |");
        }else{
            System.out.print("| " + symbol.getSym() + " |");
        }
    }
}
