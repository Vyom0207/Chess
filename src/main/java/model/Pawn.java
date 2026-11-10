package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pawn extends Piece{

    public Pawn(String color){
        super(color, "PAWN",1);
        this.pieceValue = 1;
    }

    @Override
    public List<int[]> getValidMoves(Board board, int row, int col) {

    // PAWN movement logic
    int currentRow = row;
    int currentCol = col;
    List<int[]> moves = new ArrayList<int[]>();
    
    if(color.equals("WHITE"))
    {    
            if(currentRow>0)
            {
                // check straight path
            Piece pieceAtFrontOfW = board.getPiece(currentRow-1, currentCol);
            if(pieceAtFrontOfW==null)
                moves.add(new int[]{currentRow-1, currentCol});

            // check diagnol moves if possible
            if(currentCol>0 && currentCol<7)
            {
                for(int i=currentCol-1; i<=currentCol+1; i+=2)
                {
                    Piece PieceSurroundingW = board.getPiece(currentRow-1, i);
                    if(PieceSurroundingW!=null && PieceSurroundingW.color.equals("BLACK"))
                        moves.add(new int[]{currentRow-1, i});
                } // check diagnal moves if youre at a corner  and check if the square is empty before
            } else if(currentCol == 0 && board.getPiece(currentRow-1, currentCol+1)!=null && board.getPiece(currentRow-1, currentCol+1).color.equals("BLACK"))
            {
                    moves.add(new int[]{currentRow-1, currentCol+1});
            } else if(currentCol == 7 && board.getPiece(currentRow-1, currentCol-1)!=null && board.getPiece(currentRow-1, currentCol-1).color.equals("BLACK"))
            {
                    moves.add(new int[]{currentRow-1, currentCol-1}); 
            }
            }

    } else if(color.equals("BLACK"))
    {    
            if(currentRow<7)
            {
                // check straight path
            Piece pieceAtFrontOfB = board.getPiece(currentRow+1, currentCol);
            if(pieceAtFrontOfB==null)
                moves.add(new int[]{currentRow+1, currentCol});

            // check diagnol moves if possible
            if(currentCol>0 && currentCol<7)
            {
                for(int i=currentCol-1; i<=currentCol+1; i+=2)
                {
                    Piece PieceSurroundingB = board.getPiece(currentRow+1, i);
                    if(PieceSurroundingB!=null && PieceSurroundingB.color.equals("WHITE"))
                        moves.add(new int[]{currentRow+1, i});
                } // check diagnal moves if youre at a corner  and check if the square is empty before
            } else if(currentCol == 0 && board.getPiece(currentRow+1, currentCol+1)!=null && board.getPiece(currentRow+1, currentCol+1).color.equals("WHITE"))
            {
                    moves.add(new int[]{currentRow+1, currentCol+1});
            } else if(currentCol == 7 && board.getPiece(currentRow+1, currentCol-1)!=null && board.getPiece(currentRow+1, currentCol-1).color.equals("WHITE"))
            {
                    moves.add(new int[]{currentRow+1, currentCol-1});
            }
            }

    }
    
    for(int[] move : moves)
    {
        System.out.println(Arrays.toString(move));
    }
    return moves;

    }
    
}
