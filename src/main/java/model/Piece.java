package model;

public class Piece {
    
    public String color;
    public String type;
    public int pieceValue;
    
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

}
