package src;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.Border;
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
    JPanel buttonPanel = new JPanel();

    String[] buttonValues = {
        "AC", "+/-", "%", "÷", 
        "7", "8", "9", "×", 
        "4", "5", "6", "-",
        "1", "2", "3", "+",
        "0", ".", "√", "="
    };
    
    String[] rightSymbols = {"÷", "×", "-", "+", "="};
    String[] topSymbols = {"AC", "+/-", "%"};

    Calculator () {
        frame.setVisible(true);
        frame.setSize(boardwidth, boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        displayLabel.setBackground(customBlack);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 80));
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayLabel.setText("0");
        displayLabel.setOpaque(true);

        displayPanel.setLayout(new BorderLayout());
        displayPanel.add(displayLabel);
        frame.add(displayPanel, BorderLayout.NORTH);

        buttonPanel.setLayout(new GridLayout(5, 4));
        buttonPanel.setBackground(customBlack);
        frame.add(buttonPanel);

        for (int i  = 0; i < buttonValues.length; i++) {
        JButton button = new JButton();
        String buttonValue = buttonValues[i];
        button.setFont(new Font("Arial", Font.PLAIN, 35));
        button.setText(buttonValue);
        button.setFocusable(false);
        buttonPanel.add(button);
            if (Arrays.asList(topSymbols).contains(buttonValue)) {
                button.setBackground(customLightGrey);
                button.setForeground(customBlack);
            } else {
                button.setBackground(customDarkGrey);
                button.setForeground(customBlack);
            }
            buttonPanel.add(button);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e ) {
                JButton button = (JButton) e.getSource();
                String buttonValue = button.getText();
                if (Arrays.asList(rightSymbols). contains(buttonValue)) {

                } else if (Arrays.asList(topSymbols).contains(buttonValue) ) {

                } else {
                    if (buttonValue == ".") {
                        if (!displayLabel.getText().contains(buttonValue)) {
                            displayLabel.setText(displayLabel.getText() + buttonValue);
                        }

                    } else if ("0123456789".contains(buttonValue)) {
                        if (displayLabel.getText() == "0") {
                            displayLabel.setText(buttonValue);
                        } else {
                            displayLabel.setText(displayLabel.getText() + buttonValue);
                        }
                    }
                }
                }
            });
        }

    }
}
