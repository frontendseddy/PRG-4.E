package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {
    public Grid() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(720, 480);
        this.setLayout(new GridLayout(3,3, 2, 2));
        for (int i = 0; i < 9; i++) {
            this.add(new JButton(String.valueOf(i + 1)));
        }









    }

    public static void main(String[] args) {
        new Grid().setVisible(true);
    }
}
