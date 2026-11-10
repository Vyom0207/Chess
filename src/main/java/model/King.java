package model;

import java.util.List;

public class King extends Piece {
    
    public King(String color){
        super(color, "KING", -1);       
        this.pieceValue = -1;
    }

    @Override
    public List<int[]> getValidMoves(Board board, int row, int col, String color) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValidMoves'");
    }

}
