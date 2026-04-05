import java.awt.*;
import javax.swing.*;

public class Tiktaktoe {
    int boardWidth = 600;
    int boardHeight = 650;

    public static void main(String[] args) {
        new Tiktaktoe();

    }

    JFrame frame = new  JFrame();

    Tiktaktoe() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }
}
