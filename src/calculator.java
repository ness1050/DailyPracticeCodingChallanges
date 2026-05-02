package src;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Calculator {
    int boardwidth = 360;
    int boardheight = 540;

    Color customLightGrey = new Color(212, 212, 210);
    Color customDarkGrey = new Color(80,80,80);
    Color customBlack = new Color(28, 28, 28);
    Color customOrange = new Color(255, 149, 0);



    JFrame frame = new JFrame("MyCalculator");
    JLabel displayLabel = new JLabel();
    JPanel displayPanel = new JPanel();


    Calculator () {
        frame.setVisible(true);
        frame.setSize(boardwidth, boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        displayLabel.setBackground(customBlack);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 90));
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayLabel.setText("0");
        displayLabel.setOpaque(true);

    }
}
