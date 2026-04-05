import java.awt.*;
import javax.swing.*;

import org.w3c.dom.Text;

public class Tiktaktoe {
    int boardWidth = 600;
    int boardHeight = 650;

    public static void main(String[] args) {
        new Tiktaktoe();

    }

    JFrame frame = new  JFrame();
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();


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
        frame.add(textLabel);

    }
}
