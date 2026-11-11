package model;

import java.util.List;

public class Knight extends Piece {
    
    public Knight(String color, int timesMoved)
    {
        super(color,"KNIGHT",3, timesMoved);
        this.pieceValue = 3;
    }

    
    @Override
    public List<int[]> getValidMoves(Board board, int row, int col) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValidMoves'");
    }

}
