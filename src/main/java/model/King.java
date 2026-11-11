package model;

import java.util.List;

public class King extends Piece {
    
    public King(String color, int timesMoved){
        super(color, "KING", -1, timesMoved);       
        this.pieceValue = -1;
    }

    @Override
    public List<int[]> getValidMoves(Board board, int row, int col) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValidMoves'");
    }

}
