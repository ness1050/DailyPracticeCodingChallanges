import java.awt.*;
import javax.swing.*;

import org.w3c.dom.Text;

public class Tiktaktoe {
    int boardWidth = 600;
    int boardHeight = 650;

    public static void main(String[] args) {
        new Tiktaktoe();

    }

    JFrame frame = new  JFrame("Tic-Tac-Toe");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();
    JButton [] [] board = new JButton[3][3];
    String playerX = "X";
    String playerO = "O";
    String CurrentPlayer = playerX;


    Tiktaktoe() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setBackground(Color.darkGray);
        textLabel.setForeground(Color.white);
        textLabel.setFont(new Font("Arial", Font.BOLD, 50));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Tic Tac Toe");
        textLabel.setOpaque(true);


        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textLabel, BorderLayout.NORTH);

        boardPanel.setLayout(new GridLayout(3,3));
        boardPanel.setBackground(Color.darkGray);
        frame.add(boardPanel);
         
        // for loop to create the dynamic of tic tac toe game
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton tile = new JButton();
                board[i] [j] = tile;
                boardPanel.add(tile);
            }
        } 
    }
}
