package model;

public class Board {

    public Piece[][] squares = new Piece[8][8];
    public int totalMoves;
    public int turn;
    public Board()
    {
        this.turn = 0;
        initializeBoard();
    }

    public Piece[][] getSquares()
        {
            return squares;
        }

    void initializeBoard()
    {

        // BLACK PIECES
        squares[0][0] = new Rook("BLACK");
        squares[0][1] = new Knight("BLACK");
        squares[0][2] = new Bishop("BLACK");
        squares[0][3] = new Queen("BLACK");
        squares[0][4] = new King("BLACK");
        squares[0][5] = new Bishop("BLACK");
        squares[0][6] = new Knight("BLACK");
        squares[0][7] = new Rook("BLACK");

        for(int i=0; i<=7; i++)
            squares[1][i] = new Pawn("BLACK");

        // WHITE PIECES
        squares[7][0] = new Rook("WHITE");
        squares[7][1] = new Knight("WHITE");
        squares[7][2] = new Bishop("WHITE");
        squares[7][3] = new Queen("WHITE");
        squares[7][4] = new King("WHITE");
        squares[7][5] = new Bishop("WHITE");
        squares[7][6] = new Knight("WHITE");
        squares[7][7] = new Rook("WHITE");

        for(int i=0; i<=7; i++)
            squares[6][i] = new Pawn("WHITE");
        
    }

    public Piece getPiece(int row, int col)
    {
        return squares[row][col];

    }

    public void setPiece(int row, int col, Piece piece)
    {
        squares[row][col] = piece;
    }

    public void Move(int iRow, int iCOl, int eRow, int eCol)
    {
        Piece piece = squares[iRow][iCOl];
        squares[eRow][eCol] = piece;
        squares[iRow][iCOl] = null;
    }

   
    
}
