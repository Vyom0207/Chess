package UI;
import javax.swing.*;
import java.awt.*;

public class ChessGUI {

    public static void main(String[] args) {
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

        for(int row = 0; row < 8; row++){
            for(int col = 0; col < 8; col++){

                JButton button = new JButton();
                if((row + col) % 2 == 0){
                    button.setBackground(light);
                } else {
                    button.setBackground(dark);
                }

                button.setOpaque(true);
                button.setBorderPainted(false);
                button.setFocusable(false);

                boardPanel.add(button);

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

    }

}
