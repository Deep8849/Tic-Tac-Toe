package models;

public class Cell {
    private int row;
    private int col;

    private CellState cellState;
    private Player players;

    public Cell(int row, int col, CellState cellState) {
        this.row = row;
        this.col = col;
        this.cellState = cellState;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Player getPlayers() {
        return players;
    }

    public void setPlayers(Player players) {
        this.players = players;
    }

    public void printCell(){
        if (players == null){
            System.out.println("| |");
        }
        else {
            System.out.println("|" + players.getSymbol().getaChar() + "|");
        }
    }
}
