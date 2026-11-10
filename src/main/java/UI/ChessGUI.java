package UI;
import javax.swing.*;
import java.awt.*;
import model.*;

public class ChessGUI {

    // BASICALLY UPDATING ALL THE IMAGES ON THE BUTTONS
    static void Refresh(Piece[][] piece, JButton[][] buttons)
    {
        for(int i=0; i<=7; i++)
        {
            for(int j=0; j<=7; j++)
            {               
                if(piece[i][j]!=null)
                {
                    if(piece[i][j].color.equals("BLACK"))
                    {
                        if(piece[i][j].type.equals("ROOK")){
                            buttons[i][j].setIcon(loadPiece("src/main/resources/Images/black_rook.png"));
                        } else if(piece[i][j].type.equals("BISHOP")){
                            buttons[i][j].setIcon(loadPiece("src/main/resources/Images/black_bishop.png"));
                        } else if(piece[i][j].type.equals("KING")){
                            buttons[i][j].setIcon(loadPiece("src/main/resources/Images/black_king.png"));
                        } else if(piece[i][j].type.equals("QUEEN")){
                            buttons[i][j].setIcon(loadPiece("src/main/resources/Images/black_queen.png"));
                        } else if(piece[i][j].type.equals("PAWN")){
                            buttons[i][j].setIcon(loadPiece("src/main/resources/Images/black_pawn.png"));
                        } else if(piece[i][j].type.equals("KNIGHT")){
                            buttons[i][j].setIcon(loadPiece("src/main/resources/Images/black_knight.png"));
                        }

                    } else if(piece[i][j].color.equals("WHITE"))
                    {
                        if(piece[i][j].type.equals("ROOK")){
                            buttons[i][j].setIcon(loadPiece("src/main/resources/Images/white_rook.png"));
                        } else if(piece[i][j].type.equals("BISHOP")){
                            buttons[i][j].setIcon(loadPiece("src/main/resources/Images/white_bishop.png"));
                        } else if(piece[i][j].type.equals("KING")){
                            buttons[i][j].setIcon(loadPiece("src/main/resources/Images/white_king.png"));
                        } else if(piece[i][j].type.equals("QUEEN")){
                            buttons[i][j].setIcon(loadPiece("src/main/resources/Images/white_queen.png"));
                        } else if(piece[i][j].type.equals("PAWN")){
                            buttons[i][j].setIcon(loadPiece("src/main/resources/Images/white_pawn.png"));
                        } else if(piece[i][j].type.equals("KNIGHT")){
                            buttons[i][j].setIcon(loadPiece("src/main/resources/Images/white_knight.png"));
                        }
                    }
                } else {
                    buttons[i][j].setIcon(null);
                } 
            }
        }
    }

    private static ImageIcon loadPiece(String path){

        ImageIcon image = new ImageIcon(path);

        Image scaled = image.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);

        return new ImageIcon(scaled);
    }

    public static void main(String[] args) {
        
        // creating an instance of board nd then obtaining all the pieces
        Board board = new Board(); 
        Piece[][] piece = board.getSquares();

        // creating the frame
        JFrame frame = new JFrame("Chess");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(15,15));
        mainPanel.setBackground(Color.DARK_GRAY);

        JPanel boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(8, 8));
        boardPanel.setPreferredSize(new Dimension(650,650));

        // CREATE 64 SQUARES
        Color light = new Color(240, 217, 181);
        Color dark = new Color(181, 136, 99);

        // creating 64 buttons space
        JButton[][] buttons = new JButton[8][8];
        for(int row = 0; row < 8; row++){
            for(int col = 0; col < 8; col++){
                //creating the button
                buttons[row][col] = new JButton();

                if((row + col) % 2 == 0){
                    buttons[row][col].setBackground(light);
                } else {
                    buttons[row][col].setBackground(dark);
                }

                buttons[row][col].setOpaque(true);
                buttons[row][col].setBorderPainted(false);
                buttons[row][col].setFocusable(false);

                boardPanel.add(buttons[row][col]);

            }
        }



        // MOVE HISTORY
        JPanel historyPanel = new JPanel();
        historyPanel.setLayout(new BorderLayout());
        historyPanel.setPreferredSize(new Dimension(250,650));
        historyPanel.setBackground(Color.white);

        JLabel heading = new JLabel("MOVE HISTROY");
        heading.setHorizontalAlignment(JLabel.CENTER);

        JTextArea history = new JTextArea();
        history.setEditable(false);

        historyPanel.add(heading, BorderLayout.NORTH);
        historyPanel.add(new JScrollPane(history), BorderLayout.CENTER);

        // add both panels to main panel
        mainPanel.add(boardPanel, BorderLayout.CENTER);
        mainPanel.add(historyPanel, BorderLayout.EAST);

        // add main panel to window
        frame.add(mainPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,750);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    
        // refresh everything
        Refresh(piece, buttons);

    }

}
