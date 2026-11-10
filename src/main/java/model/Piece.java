package model;

import java.util.List;

public abstract class Piece {
    
    public String color;
    public String type;
    public int pieceValue;
    static Board board = new Board();
    
    public enum Color{
        W, B;
    }

    public enum Type{
        c, ROOK, KNIGHT, BISHOP, QUEEN, KING;
    }

    public Piece(String color, String type, int pieceValue) {
        this.color = color;
        this.type = type;
        this.pieceValue = pieceValue;
    }

    public abstract List<int[]> getValidMoves(Board board, int row, int col);

}
