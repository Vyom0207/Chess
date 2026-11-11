package model;

public class Board {

    public Piece[][] squares = new Piece[8][8];
    public int totalMoves;
    public int turn;

    static int startRow = 0;
    static int startCol = 0;
    static int endRow = 7;
    static int endCol = 7;
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
        squares[0][0] = new Rook("BLACK", 0);
        squares[0][1] = new Knight("BLACK", 0);
        squares[0][2] = new Bishop("BLACK", 0);
        squares[0][3] = new Queen("BLACK", 0);
        squares[0][4] = new King("BLACK",0);
        squares[4][4] = new Bishop("BLACK",0);
        squares[0][6] = new Knight("BLACK",0);
        squares[0][7] = new Rook("BLACK",0);

        //for(int i=0; i<=7; i++)
          //  squares[1][i] = new Pawn("BLACK", 0);

        // WHITE PIECES
        squares[7][0] = new Rook("WHITE",0);
        squares[7][1] = new Knight("WHITE",0);
        squares[7][2] = new Bishop("WHITE",0);
        squares[7][3] = new Queen("WHITE",0);
        squares[7][4] = new King("WHITE",0);
        squares[7][5] = new Bishop("WHITE",0);
        squares[3][5] = new Knight("WHITE",0);
        squares[7][7] = new Rook("WHITE",0);

        for(int i=0; i<=7; i++)
            squares[6][i] = new Pawn("WHITE", 0);
        
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
