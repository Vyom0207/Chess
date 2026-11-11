package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bishop extends Piece {
    
    

    public Bishop(String color, int timesMoved){
        super(color, "BISHOP", 3, timesMoved);
        this.pieceValue = 3;
    }


    @Override
    public List<int[]> getValidMoves(Board board, int row, int col) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getValidMoves'");
        int currentRow = row;
        int currentCol = col;
        List<int[]> availableMoves = new ArrayList<>();

        int[][] directions = {
            {1,1},
            {-1,-1},
            {1,-1},
            {-1,1}
        };

        for(int[] dir : directions)
        {
            int deltaRow = dir[0];
            int deltaCol = dir[1];

            for(int i=1; i<=board.endCol; i++)
            {
                // edge cases
                if(currentRow + i*deltaRow > board.endRow || currentRow + i*deltaRow < board.startRow
                   || currentCol + i*deltaCol > board.endCol || currentCol + i*deltaCol < board.startCol)
                    break;

                Piece surroundingPiece = board.getPiece(currentRow + i*deltaRow, currentCol + i*deltaCol);

                if(surroundingPiece == null)
                    availableMoves.add(new int[]{currentRow + i*deltaRow, currentCol + i*deltaCol});
                else if(color.equals(surroundingPiece.color))
                    break;
                else if(!color.equals(surroundingPiece.color))
                {
                    availableMoves.add(new int[]{currentRow + i*deltaRow, currentCol + i*deltaCol});
                    break;
                }
            }
        }
        for(int[] move : availableMoves)
        {
            System.out.println(Arrays.toString(move));
        }
        System.out.println();

        return availableMoves;
    }

}