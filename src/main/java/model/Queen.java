package model;

import java.util.List;

public class Queen extends Piece {

    public Queen(String color, int timesMoved){
        super(color, "QUEEN",9,  timesMoved);
        this.pieceValue = 9;
    }

    

    @Override
    public List<int[]> getValidMoves(Board board, int row, int col) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValidMoves'");
    }
    
}
