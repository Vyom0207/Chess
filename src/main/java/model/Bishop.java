package model;

import java.util.List;

public class Bishop extends Piece {
    
    

    public Bishop(String color){
        super(color, "BISHOP", 3);
        this.pieceValue = 3;
    }

    @Override
    public List<int[]> getValidMoves(Board board, int row, int col, String color) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValidMoves'");
    }

}
