package UI;
import model.*;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.List;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class BoardClickListener implements ActionListener {

    Board board;
    JButton[][] buttons;

    public BoardClickListener(Board board)
    {
        this.board = board;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton clickedButton = (JButton) e.getSource();

        int row = (int) clickedButton.getClientProperty("row");
        int col = (int) clickedButton.getClientProperty("col");

        Piece currentPiece = board.getPiece(row, col);

        if(currentPiece.type != null){

            currentPiece.getValidMoves(board, row, col);

        } 


    }
}