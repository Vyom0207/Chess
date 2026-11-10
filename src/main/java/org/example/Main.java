package org.example;

import model.Board;
import model.Piece;

public class Main {
    public static void main(String[] args) {

        Board board = new Board();

        Piece piece = board.getPiece(7,5);
        System.out.println(piece.pieceValue);
        
    }
}
