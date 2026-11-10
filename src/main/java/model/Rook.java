package model;

import java.util.List;

public class Rook extends Piece{

    public Rook(String color){
        super(color, "ROOK",5);
        this.pieceValue = 5;
    }

    @Override
    public List<int[]> getValidMoves(Board board, int row, int col, String color) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValidMoves'");
    }   


}
