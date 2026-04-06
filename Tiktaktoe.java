import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tiktaktoe {

    int boardWidth = 600;
    int boardHeight = 650;

    JFrame frame = new JFrame("Tic-Tac-Toe");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();
    JButton[][] board = new JButton[3][3];

    String playerX = "X";
    String playerO = "O";
    String currentPlayer = playerX;

    boolean gameOver = false;

    public static void main(String[] args) {
        new Tiktaktoe();
    }

    Tiktaktoe() {
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Top text panel
        textLabel.setBackground(Color.darkGray);
        textLabel.setForeground(Color.white);
        textLabel.setFont(new Font("Arial", Font.BOLD, 50));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Tic Tac Toe");
        textLabel.setOpaque(true);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);

        // Board panel
        boardPanel.setLayout(new GridLayout(3, 3));
        boardPanel.setBackground(Color.darkGray);
        frame.add(boardPanel, BorderLayout.CENTER);

        // Create buttons
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton tile = new JButton();
                board[i][j] = tile;
                boardPanel.add(tile);

                tile.setBackground(Color.darkGray);
                tile.setForeground(Color.white);
                tile.setFont(new Font("Arial", Font.BOLD, 120));
                tile.setFocusable(false);

                tile.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (gameOver) return;

                        JButton tile = (JButton) e.getSource();

                        if (tile.getText().isEmpty()) {
                            tile.setText(currentPlayer);
                            checkWinner();

                            if (!gameOver) {
                                currentPlayer = currentPlayer.equals(playerX) ? playerO : playerX;
                                textLabel.setText(currentPlayer + "'S TURN");
                            }
                        }
                    }
                });
            }
        }

        frame.setVisible(true);
    }

 
    void checkWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0].getText().isEmpty()) continue;

            if (board[i][0].getText().equals(board[i][1].getText()) &&
                board[i][1].getText().equals(board[i][2].getText())) {
                setWinner(board[i][0], board[i][1], board[i][2]);
                return;
            }
        }

        // Check columns
        for (int c = 0; c < 3; c++) {
            if (board[0][c].getText().isEmpty()) continue;

            if (board[0][c].getText().equals(board[1][c].getText()) &&
                board[1][c].getText().equals(board[2][c].getText())) {
                setWinner(board[0][c], board[1][c], board[2][c]);
                return;
            }
        }

        // Check main diagonal
        if (!board[0][0].getText().isEmpty() &&
            board[0][0].getText().equals(board[1][1].getText()) &&
            board[1][1].getText().equals(board[2][2].getText())) {
            setWinner(board[0][0], board[1][1], board[2][2]);
            return;
        }

        // Check anti-diagonal
        if (!board[0][2].getText().isEmpty() &&
            board[0][2].getText().equals(board[1][1].getText()) &&
            board[1][1].getText().equals(board[2][0].getText())) {
            setWinner(board[0][2], board[1][1], board[2][0]);
            return;
        }

        // Check for Draw
        if (isBoardFull()) {
            gameOver = true;
            textLabel.setText("It's a DRAW!");
            askToRestart();
        }
    }

    void setWinner(JButton a, JButton b, JButton c) {
        gameOver = true;
        a.setForeground(Color.green);
        b.setForeground(Color.green);
        c.setForeground(Color.green);

        textLabel.setText(currentPlayer + " IS THE WINNER! 🎉");
        askToRestart();
    }

    boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].getText().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    void askToRestart() {
        int choice = JOptionPane.showConfirmDialog(frame,
                "Game Over!\nWould you like to play again?",
                "Restart Game",
                JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            resetGame();
        }
    }

    void resetGame() {
        currentPlayer = playerX;
        gameOver = false;
        textLabel.setText("Tic Tac Toe");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j].setText("");
                board[i][j].setForeground(Color.white);
            }
        }
    }
}