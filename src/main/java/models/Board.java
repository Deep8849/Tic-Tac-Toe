package models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int daimention;
    private List<List<Cell>> board;

    public Board(int daimention) {
        this.daimention = daimention;
        this.board = new ArrayList<>();

        for (int i=0; i<daimention; i++) {
            board.add(new ArrayList<>());

            for (int j=0; j<daimention; j++) {
                board.get(i).add(new Cell(i, j, CellState.EMPTY));
            }
        }
    }

    public int getDaimention() {
        return daimention;
    }

    public void setDaimention(int daimention) {
        this.daimention = daimention;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public void printBoard() {
        for (List<Cell> row : board) {
            for (Cell cell : row) {
                cell.printCell();
            }
        }
    }
}
