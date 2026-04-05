import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


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

    boolean gameOver = false;


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
                tile.setBackground(Color.darkGray);
                tile.setForeground(Color.white);
                tile.setFont(new Font("Arial", Font.BOLD, 120));
                tile.setFocusable(false);

                tile.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (gameOver) return;
                        JButton tile = (JButton) e.getSource();
                      
    

                        if(tile.getText() == "") {
                            tile.setText(CurrentPlayer);
                            checkWinner();

                            if (!gameOver) {
                                CurrentPlayer = CurrentPlayer == playerX ? playerO : playerX;
                                textLabel.setText(CurrentPlayer + "'S turn.");
                            }
                         
                        }
                       

                    }

                    void checkWinner() {
                       for (int i = 0; i < 3; i++) {
                        if (board[i][0].getText() == "") continue;

                        if (board[i] [0].getText() == board [i][1].getText() && board[i][1].getText()
                         == board [i][2].getText()) {
                            for (int j = 0; j < 3; j++) {
                                setWinner(board[i] [j]);
                            }
                            gameOver = true;
                            return;
                        }
                       }
                    }

                    void setWinner(JButton tile) {
                       tile.setForeground(Color.green);
                       tile.setForeground(Color.gray);
                       textLabel.setText(CurrentPlayer + " is the winner");
                       System.out.println("Want to restart the game!");

                    }
                });
            }
        } 
    }
}
