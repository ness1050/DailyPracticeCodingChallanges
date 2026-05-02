package src;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;

public class Calculator {
    int boardwidth = 360;
    int boardheight = 540;

    Color customLightGrey = new Color(212, 212, 210);
    Color customDarkGrey = new Color(80, 80, 80);
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

    String[] rightSymbols = {"÷", "×", "-", "+"};
    String[] topSymbols = {"AC", "+/-", "%"};

    String A = "0";
    String operator = null;
    String B = null;

    Calculator() {
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

        for (int i = 0; i < buttonValues.length; i++) {
            JButton button = new JButton();
            String buttonValue = buttonValues[i];

            button.setFont(new Font("Arial", Font.PLAIN, 35));
            button.setText(buttonValue);
            button.setFocusable(false);

            // Styling
            if (Arrays.asList(topSymbols).contains(buttonValue)) {
                button.setBackground(customLightGrey);
                button.setForeground(customBlack);
            } else if (Arrays.asList(rightSymbols).contains(buttonValue) || buttonValue.equals("=")) {
                button.setBackground(customOrange);
                button.setForeground(Color.white);
            } else {
                button.setBackground(customDarkGrey);
                button.setForeground(Color.white);
            }

            buttonPanel.add(button); // ✅ FIXED: only added once

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton btn = (JButton) e.getSource();
                    String value = btn.getText();

                    // =========================
                    // EQUALS
                    // =========================
                    if (value.equals("=")) {
                        if (operator != null && A != null) {
                            B = displayLabel.getText();

                            double numA = Double.parseDouble(A);
                            double numB = Double.parseDouble(B);
                            double result = 0;

                            if (operator.equals("+")) {
                                result = numA + numB;
                            } else if (operator.equals("-")) {
                                result = numA - numB;
                            } else if (operator.equals("×")) {
                                result = numA * numB;
                            } else if (operator.equals("÷")) {
                                result = numA / numB;
                            }

                            displayLabel.setText(removeZeroDecimal(result));

                            // reset state
                            A = displayLabel.getText();
                            operator = null;
                            B = null;
                        }
                    }

                    // =========================
                    // OPERATORS
                    // =========================
                    else if (Arrays.asList(rightSymbols).contains(value)) {
                        if (operator == null) {
                            A = displayLabel.getText();
                            displayLabel.setText("0");
                        }
                        operator = value;
                    }

                    // =========================
                    // TOP BUTTONS
                    // =========================
                    else if (Arrays.asList(topSymbols).contains(value)) {
                        if (value.equals("AC")) {
                            clearAll();
                            displayLabel.setText("0");

                        } else if (value.equals("+/-")) {
                            double num = Double.parseDouble(displayLabel.getText());
                            num *= -1;
                            displayLabel.setText(removeZeroDecimal(num));

                        } else if (value.equals("%")) {
                            double num = Double.parseDouble(displayLabel.getText());
                            num /= 100;
                            displayLabel.setText(removeZeroDecimal(num));
                        }
                    }

                    // =========================
                    // NUMBERS & DOT
                    // =========================
                    else {
                        if (value.equals(".")) {
                            if (!displayLabel.getText().contains(".")) {
                                displayLabel.setText(displayLabel.getText() + ".");
                            }
                        } else if ("0123456789".contains(value)) {
                            if (displayLabel.getText().equals("0")) {
                                displayLabel.setText(value);
                            } else {
                                displayLabel.setText(displayLabel.getText() + value);
                            }
                        }
                    }
                }
            });
        }
    }

    void clearAll() {
        A = "0";
        B = null;
        operator = null;
    }

    String removeZeroDecimal(double num) {
        if (num % 1 == 0) {
            return Integer.toString((int) num);
        }
        return Double.toString(num);
    }

}